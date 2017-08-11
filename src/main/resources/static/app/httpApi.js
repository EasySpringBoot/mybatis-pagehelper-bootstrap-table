$(function () {
    var columns = [];
    columns.push({
        title: 'ID',
        field: '',
        align: 'center',
        valign: 'middle',
        formatter: function (value, row, index) {
            return row.id
        }
    });

    columns.push({
        title: '名称',
        field: 'name',
        align: 'center',
        valign: 'middle',
        formatter: function (value, row, index) {
            return value
        }
    }, {
        title: 'URL',
        field: 'url',
        align: 'center',
        valign: 'middle',
        formatter: function (value, row, index) {
            return "<a target='_blank' href='" + value + "'>" + value + "</a>"
        }
    }, {
        title: '请求方法',
        field: 'method',
        align: 'center',
        valign: 'middle',
        formatter: function (value, row, index) {
            return value
        }
    }, {
        title: '操作',
        field: '',
        align: 'center',
        valign: 'middle',
        formatter: function (value, row, index) {
            var html = "";
            html += '<a target="_blank" href="edit?id=' + row.id + '">编辑</a> | '
            html += '<a target="_blank" href="delelte?id=' + row.id + '">删除</a> | '
            html += '<a target="_blank" href="detail?id=' + row.id + '">预览</a>'
            return html
        }
    })

    $('#httpApiTable').bootstrapTable({
        //detailView: true,
        url: 'httpApi.json',
        sidePagination: "server",
        queryParamsType: 'pageNo,pageSize',
        contentType: "application/x-www-form-urlencoded",
        method: 'get',
        striped: false,     //是否显示行间隔色
        cache: false,      //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true,  //是否显示分页（*）
        paginationLoop: false,
        sortable: true,    //是否启用排序
        sortOrder: "desc",   //排序方式
        sortName: "id",
        pageNumber: 1,     //初始化加载第一页，默认第一页
        pageSize: 10,      //每页的记录行数（*）
        pageList: [5, 10, 20, 50, 100], // 可选的每页数据
        totalField: 'total',
        dataField: 'list', //后端 json 对应的表格数据 key
        columns: columns,
        queryParams: function (params) {
            return {
                pageSize: params.pageSize,
                pageNo: params.pageNumber,
                sortName: params.sortName,
                sortOrder: params.sortOrder
            }
        }
    })
})
