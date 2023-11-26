package com.parasoft.parabank.models


data class Name(var firstName: String, var lastName: String)

data class Address(var street: String, var city: String, var state: String, var zipcode: String)

data class User(var username: String, var password: String)
data class Customer(
    var name: Name,
    var address: Address,
    var phoneNumber: String,
    var ssn: String,
    var user: User
)