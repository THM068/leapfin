package com.leapfin

class Profile {


    String phone
    Address address
    String email
    String website
    String twitter
    String backgroundInfo

    static constraints = {
        twitter(twitter: true, nullable: true)
        backgroundInfo(maxSize: 100000, nullable: true)
        phone(nullable: true)
        email(nullable: true)
        website(nullable: true)
        address(nullable: true)
    }
}
