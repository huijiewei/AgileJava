package com.huijiewei.agile.cloud.order.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore
public class HomeController {
    @RequestMapping(value = "/")
    public String actionIndex() {
        return "redirect:/swagger-ui.html";

    }
}
