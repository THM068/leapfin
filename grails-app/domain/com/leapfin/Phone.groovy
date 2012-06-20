package com.leapfin

class Phone {

    String number
    String type

    static constraints = {
        number(nullable: true)
        type(nullable: true)
    }
}
