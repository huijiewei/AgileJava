package com.huijiewei.agile.server.config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
open class Application {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplicationBuilder(Application::class.java)
                    .web(true)
                    .run(*args)
        }
    }
}