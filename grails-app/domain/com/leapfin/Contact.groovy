package com.leapfin

class Contact extends Profile {

    String firstName
    String lastName

    static constraints = {
        firstName(nullable: true)
        lastName(nullable: true)
    }
}
