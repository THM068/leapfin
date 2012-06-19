package com.leapfin

class Contact extends Profile {

    String firstName
    String lastName
    String title
    String companyName

    static constraints = {
        firstName(nullable: true)
        lastName(nullable: true)
        title(nullable: true)
        companyName(nullable: true)
    }

    def getProfileId() {
        "${id}-${firstName}"
    }
}
