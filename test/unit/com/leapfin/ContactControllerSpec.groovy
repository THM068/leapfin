package com.leapfin

import grails.plugin.spock.ControllerSpec

class ContactControllerSpec extends ControllerSpec {

    def setup() {
        mockDomain Contact
        mockDomain Phone
    }

    def 'A contact can be saved'() {
        given:
            controller.params.firstName = firstName
            controller.params.lastName = lastName
            controller.params.title = title
            controller.params.companyName = companyName
            controller.params.website = website

            controller.params."phone" = '232323'


            controller.params."email" = 'thando@hotmail.com'
            controller.params."type" = 'Work'

            controller.params.address = 'some address'
            controller.params.city = 'some city'
            controller.params.postCode = 'some post code'
            controller.params.state = 'some state'
            controller.params.country = 'some country'


        when:
            controller.addPerson()
        then:
            def p = Contact.list().first()
            def phone = Phone.list().first()

            p.phone ==  '232323'
            phone.type ==  type
            p.firstName == firstName
            p.lastName == lastName
            p.title == title
            p.companyName == companyName
            p.email == email
            p.website == website


        and:
            controller.chainArgs.action == 'profile'
            controller.chainArgs.id == "${p.profileId}"
            controller.chainArgs.model.contact == p
        where:
            firstName = 'Toby'
            lastName = 'Scoop'
            title = 'Sir'
            companyName = 'Peeria'
            type = 'Work'
            email = 'thando@hotmail.com'
            website = 'hotmail.com'
    }
}
