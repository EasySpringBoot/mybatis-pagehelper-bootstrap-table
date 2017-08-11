package com.easy.springboot.mybatispagehelperfreemarker.controller

import com.easy.springboot.mybatispagehelperfreemarker.model.HttpApi
import com.easy.springboot.mybatispagehelperfreemarker.service.HttpApiService
import com.github.pagehelper.PageInfo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.servlet.ModelAndView

@Controller
class HttpApiController {
    @Autowired val httpApiService: HttpApiService? = null

    @RequestMapping(value = "/httpApi.json", method = arrayOf(RequestMethod.GET, RequestMethod.POST))
    @ResponseBody
    fun httpApiJson(@RequestParam(value = "pageNo", required = false) pageNo: Int,
                    @RequestParam(value = "pageSize", required = false) pageSize: Int): PageInfo<HttpApi>? {
        return httpApiService?.getHttpApiPage(pageNo, pageSize)
    }

    @RequestMapping(value = "/httpApi.html")
    fun httpApiHtml():ModelAndView{
        return ModelAndView("index")
    }
}
