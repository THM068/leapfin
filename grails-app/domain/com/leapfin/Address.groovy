package com.leapfin

class Address {
    String address
    String city
    String country
    String postCode
    String state

    static constraints = {
        address(nullable: true)
        city(nullable: true)
        country(nullable: true)
        postCode(nullable: true)
        state(nullable: true)
    }
}
