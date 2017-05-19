package com.huijiewei.agile.cloud.order.api.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import springfox.documentation.annotations.ApiIgnore

@Controller
@ApiIgnore
open class HomeController {
    @RequestMapping(value = "/")
    open fun actionIndex(): String {
        return "redirect:/swagger-ui.html"
    }
}