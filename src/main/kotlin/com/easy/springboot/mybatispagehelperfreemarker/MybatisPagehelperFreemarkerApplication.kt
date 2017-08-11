package com.easy.springboot.mybatispagehelperfreemarker

import com.easy.springboot.mybatispagehelperfreemarker.mapper.HttpApiMapper
import com.easy.springboot.mybatispagehelperfreemarker.model.HttpApi
import org.mybatis.spring.annotation.MapperScan
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import java.util.*

@SpringBootApplication
@MapperScan(basePackages= arrayOf("com.easy.springboot.mybatispagehelperfreemarker.mapper"))
class MybatisPagehelperFreemarkerApplication : CommandLineRunner {
    @Autowired val httpApiMapper: HttpApiMapper? = null

    override fun run(vararg args: String?) {
        val record = HttpApi()
        record.url = "http://www.baidu.com"
        record.gmtCreate = Date()
        record.gmtModify = Date()
        record.method = "GET"
        record.name = "百度一下，你就知道"
        record.state = 0
        httpApiMapper?.insert(record)
    }

}

fun main(args: Array<String>) {
    SpringApplication.run(MybatisPagehelperFreemarkerApplication::class.java, *args)
}
