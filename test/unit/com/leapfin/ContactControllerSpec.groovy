package com.leapfin

import grails.plugin.spock.ControllerSpec

class ContactControllerSpec extends ControllerSpec {

    def setup() {
        mockDomain Contact
    }

    def 'A contact can be saved'() {
        given:
            controller.params.firstName = firstName
            controller.params.lastName = lastName
            controller.params.title = title
            controller.params.companyName = companyName
        when:
            controller.addPerson()
        then:
            def p = Contact.list().first()
            p.firstName == firstName
            p.lastName == lastName
            p.title == title
            p.companyName == companyName

        and:
            controller.chainArgs.action == 'profile'
            controller.chainArgs.id == "${p.profileId}"
            controller.chainArgs.model.contact == p
        where:
            firstName = 'Toby'
            lastName = 'Scoop'
            title = 'Sir'
            companyName = 'Peeria'
    }
}
