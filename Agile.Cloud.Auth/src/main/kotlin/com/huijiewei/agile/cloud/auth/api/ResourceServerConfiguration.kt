package com.huijiewei.agile.cloud.auth.api

import org.springframework.context.annotation.Configuration
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer

@Configuration
@EnableResourceServer
open class ResourceServerConfiguration : ResourceServerConfigurerAdapter() {
    override fun configure(resources: ResourceServerSecurityConfigurer?) {
        super.configure(resources)
    }
}