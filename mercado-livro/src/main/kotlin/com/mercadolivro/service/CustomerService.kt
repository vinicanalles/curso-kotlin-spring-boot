package com.mercadolivro.service

import com.mercadolivro.controller.request.PostCustomerRequest
import com.mercadolivro.controller.request.PutCustomerRequest
import com.mercadolivro.model.CustomerModel
import org.springframework.stereotype.Service

@Service
class CustomerService {

    val customers = mutableListOf<CustomerModel>()

    fun getAll(name: String?): List<CustomerModel> {
        name?.let {
            return customers.filter { it.name.contains(name, true) }
        }
        return customers
    }

    fun getCustomer(id: String): CustomerModel {
        return customers.first { customer -> customer.id == id }
    }

    fun create(customerModel: PostCustomerRequest) {
        val id = if (customers.isEmpty()) {
            1
        } else {
            customers.last().id.toInt() + 1
        }.toString()

        customers.add(CustomerModel(id, customerModel.name, customerModel.email))
    }

    fun update(id: String, customerModel: PutCustomerRequest) {
        customers.first { customer -> customer.id == id }.let {
            it.name = customerModel.name
            it.email = customerModel.email
        }
    }

    fun delete(id: String) {
        customers.removeIf { it.id == id }
    }
}