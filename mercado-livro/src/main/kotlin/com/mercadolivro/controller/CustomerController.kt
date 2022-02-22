package com.mercadolivro.controller

import com.mercadolivro.controller.request.PostCustomerRequest
import com.mercadolivro.model.CustomerModel
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("customer")
class CustomerController {

    @GetMapping
    fun getCustomer(): CustomerModel {
        return CustomerModel(
            "1",
            "Vinicius",
            "vinicanalles@gmail.com"
        )
    }

    @PostMapping
    fun create(@RequestBody customerModel: PostCustomerRequest) {
        println(customerModel)
    }
}