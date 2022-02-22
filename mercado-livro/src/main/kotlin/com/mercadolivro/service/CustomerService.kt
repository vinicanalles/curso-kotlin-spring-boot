package com.mercadolivro.service

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

    fun create(customerModel: CustomerModel) {
        val id = if (customers.isEmpty()) {
            1
        } else {
            customers.last().id!!.toInt() + 1
        }.toString()

        customerModel.id = id

        customers.add(customerModel)
    }

    fun update(customerModel: CustomerModel) {
        customers.first { customer -> customer.id == customerModel.id }.let {
            it.name = customerModel.name
            it.email = customerModel.email
        }
    }

    fun delete(id: String) {
        customers.removeIf { it.id == id }
    }
}