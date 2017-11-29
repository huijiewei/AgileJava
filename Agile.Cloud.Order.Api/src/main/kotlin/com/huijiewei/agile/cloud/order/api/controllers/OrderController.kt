package com.huijiewei.agile.cloud.order.api.controllers

import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/order"])
open class OrderController {
    @RequestMapping(value = [""], method = [RequestMethod.GET])
    @ApiOperation(value = "获取订单列表", notes = "根据用户获取订单列表")
    open fun actionList(): String {
        return "Hello world"
    }
}
