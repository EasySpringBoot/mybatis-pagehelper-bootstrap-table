package com.easy.springboot.mybatispagehelperfreemarker.service

import com.easy.springboot.mybatispagehelperfreemarker.model.HttpApi
import com.github.pagehelper.PageInfo

interface HttpApiService {
    fun getHttpApiPage(pageNo: Int, pageSize: Int): PageInfo<HttpApi>
}
