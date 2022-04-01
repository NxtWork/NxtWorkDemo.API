package com.app.model.profile;

import com.app.model.common.Contacts;

import java.util.Date;
import java.util.UUID;

public class User {
    private UUID id;
    private String firstName;
    private String lastName;
    private Date dob;
    private Contacts contacts;
    private Cv cv;
    private UUID cvId;
    private String password;
    private Preferences preferences;

    public User(UUID id, String firstName, String lastName, Date dob, Contacts contacts, Cv cv, UUID cvId ,String password, Preferences preferences) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.contacts = contacts;
        this.cv = cv;
        this.cvId = cvId;
        this.password = password;
        this.preferences = preferences;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    public Cv getCv() {
        return cv;
    }

    public void setCv(Cv cv) {
        this.cv = cv;
    }

    public UUID getCvId() {
        return cvId;
    }

    public void setCvId(UUID cvId) {
        this.cvId = cvId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Preferences getPreferences() {
        return preferences;
    }

    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }
}
