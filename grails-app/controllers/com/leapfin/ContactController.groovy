package com.leapfin

class ContactController {

    def list = {}

    def create = {}

    def addPerson = {
        def contact = new Contact(params)
        contact.save()

        chain(action: 'profile', id: contact.profileId, model: [contact: contact])
    }

    def profile = {

    }
}
