package com.leapfin

import grails.plugin.spock.UnitSpec

class ContactUnitSpec extends UnitSpec {

    def setup() {
        mockDomain Contact
    }

    def 'A contact basic details can be saved'() {
        given:
            def details = [firstName: 'Thando', lastName: 'Mafela', title: 'Mr', companyName: 'leapfin']
            def contact = new Contact(details)

        when:
            contact.save()
        then:
            def c = Contact.list().first()
            c.firstName == 'Thando'
            c.lastName == 'Mafela'
            c.title == 'Mr'
            c.companyName == 'leapfin'
    }
}
