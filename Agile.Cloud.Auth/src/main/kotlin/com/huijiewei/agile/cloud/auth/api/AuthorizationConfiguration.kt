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
                ?.withClient("client")
                ?.secret("secret")
                ?.authorizedGrantTypes(
                        "authorization_code",
                        "implicit",
                        "password",
                        "client_credentials"
                )
                ?.scopes("app")
    }
}