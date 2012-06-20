package com.leapfin

class ContactController {

    def list = {}

    def create = {}

    def addPerson = {
        Address address = new Address(address: params.address, city: params.city, postCode: params.postCode, state: params.state, country: params.country)
        address.save()
        def contact = new Contact(address: address)
        buildContact(contact)

        chain(action: 'profile', id: contact.profileId, model: [contact: contact])
    }

    def profile = {

    }

    private buildContact(contact) {
        contact.identity {
             firstName = params.firstName
             lastName = params.lastName
             title = params.title
             companyName = params.companyName
             email = params.email
             website = params.website
             phone = params.phone
             save()
        }
    }


}
