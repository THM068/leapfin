package com.leapfin

class Profile {

    String twitter
    String backgroundInfo

    static constraints = {
        name(twitter: true)
        name(backgroundInfo: true, maxSize: 100000)
    }
}
