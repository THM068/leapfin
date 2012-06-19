package com.leapfin

class Company extends Profile {
    String name

    static constraints = {
        name(nullable: true)
    }
}
