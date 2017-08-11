package com.easy.springboot.mybatispagehelperfreemarker.service

import com.easy.springboot.mybatispagehelperfreemarker.mapper.HttpApiMapper
import com.easy.springboot.mybatispagehelperfreemarker.model.HttpApi
import com.github.pagehelper.PageHelper
import com.github.pagehelper.PageInfo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class HttpApiServiceImpl : HttpApiService {
    @Autowired val httpApiMapper: HttpApiMapper? = null
    override fun getHttpApiPage(pageNo: Int, pageSize: Int): PageInfo<HttpApi> {
        PageHelper.startPage<HttpApi>(pageNo, pageSize)
        val list = httpApiMapper?.findAll()
        return PageInfo<HttpApi>(list)
    }
}

