package com.huijiewei.agile.server.discovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
open class Application {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplicationBuilder(Application::class.java).web(true).run(*args)
        }
    }
}