package com.huijiewei.agile.cloud.auth.api

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
open class SwaggerConfig {
    @Bean
    open fun createApi(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.huijiewei.agile.cloud.auth.api"))
                .paths(PathSelectors.any())
                .build()
    }

    private fun buildApiInfo(): ApiInfo {
        return ApiInfoBuilder()
                .title("Agile 订单系统接口文档")
                .build()
    }
}
