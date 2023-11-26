package com.demoblaze.models

data class User(val username: String, val password: String)

data class Address(val country: String, val city: String, val zipcode: String)

data class Card(val number: String, val holder: String, val cvv: String)

data class Customer(val name: String, val user: User, val address: Address, val card: Card)
