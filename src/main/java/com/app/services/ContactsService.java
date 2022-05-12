package com.app.services;

import com.app.model.common.Contacts;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ContactsService {
    private List<Contacts> ContactsList;

    public ContactsService() {
        ContactsList = new ArrayList<>();

        Faker faker = new Faker();

        Contacts contacts = new Contacts();
        contacts.setId(UUID.fromString("b3340266-d226-11ec-9d64-0242ac120002"));
        contacts.setPhone(faker.phoneNumber().phoneNumber());
        contacts.setEmail(faker.internet().emailAddress());
        contacts.setAddress(faker.address().streetAddress());
        ContactsList.add(contacts);

        contacts = new Contacts();
        contacts.setId(UUID.fromString("b33408c4-d226-11ec-9d64-0242ac120002"));
        contacts.setPhone(faker.phoneNumber().phoneNumber());
        contacts.setEmail(faker.internet().emailAddress());
        contacts.setAddress(faker.address().streetAddress());
        ContactsList.add(contacts);
    }

    public Contacts getContactsById(UUID contactsId) {
        for (Contacts contacts : ContactsList) {
            UUID conId = contacts.getId();
            if (conId.equals(contactsId)) {
                return contacts;
            }
        }
        return null;
    }
}
