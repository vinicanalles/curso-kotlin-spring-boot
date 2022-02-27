package com.mercadolivro.service

import com.mercadolivro.model.CustomerModel
import com.mercadolivro.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(
    val customerRepository: CustomerRepository
) {
    fun getAll(name: String?): List<CustomerModel> {
        name?.let {
            return customerRepository.findByNameContaining(it)
        }
        return customerRepository.findAll().toList()
    }

    fun getCustomer(id: Int): CustomerModel {
        return customerRepository.findById(id).orElseThrow()
    }

    fun create(customerModel: CustomerModel) {
        customerRepository.save(customerModel)
    }

    fun update(customerModel: CustomerModel) {
        if (!customerRepository.existsById(customerModel.id!!)) {
            throw Exception()
        }
        customerRepository.save(customerModel)
    }

    fun delete(id: Int) {
        if (!customerRepository.existsById(id!!)) {
            throw Exception()
        }
        customerRepository.deleteById(id)
    }
}