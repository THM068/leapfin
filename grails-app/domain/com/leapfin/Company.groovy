package com.leapfin

class Company {
    String name
    String twitter
    String backgroundInfo

    static constraints = {
        name(nullable: true)
        name(twitter: true)
        name(backgroundInfo: true, maxSize: 100000)
    }
}
