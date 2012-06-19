package com.leapfin

class Profile {

    String twitter
    String backgroundInfo

    static constraints = {
        twitter(twitter: true, nullable: true)
        backgroundInfo(maxSize: 100000, nullable: true)
    }
}
