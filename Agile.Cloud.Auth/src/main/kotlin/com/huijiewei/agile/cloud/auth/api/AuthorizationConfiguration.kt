package com.huijiewei.agile.cloud.auth.api

import org.springframework.context.annotation.Configuration
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer

@Configuration
@EnableAuthorizationServer
open class AuthorizationConfiguration : AuthorizationServerConfigurerAdapter() {
    override fun configure(clients: ClientDetailsServiceConfigurer?) {
        clients
                ?.inMemory()
                ?.withClient("mvcWeb")
                ?.secret("secret")
                ?.authorizedGrantTypes(
                        "authorization_code"
                )
                ?.scopes("app")
                ?.and()
                ?.withClient("orderCloud")
                ?.secret("secret")
                ?.authorizedGrantTypes(
                        "implicit"
                )
                ?.scopes("order")
    }
}