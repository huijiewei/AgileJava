package com.huijiewei.agile.web.mvc.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class HomeController {
    @RequestMapping(value = ["/"], method = [RequestMethod.GET])
    fun actionIndex(): String {
        return "home/index"
    }
}