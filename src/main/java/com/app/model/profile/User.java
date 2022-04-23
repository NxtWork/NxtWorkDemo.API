package com.app.model.profile;

import com.app.model.common.Contacts;

import java.util.Date;
import java.util.UUID;

public class User {
    private UUID id;
    private String firstName;
    private String lastName;
    private Date dob;
    private UUID contacts_id;
    private UUID cv_id;
    private UUID cvId;
    private String password;
    private UUID preferences_id;

    public User(UUID id, String firstName, String lastName, Date dob, UUID contacts_id, UUID cv_id, UUID cvId, String password, UUID preferences_id) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.contacts_id = contacts_id;
        this.cv_id = cv_id;
        this.cvId = cvId;
        this.password = password;
        this.preferences_id = preferences_id;
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

    public UUID getContacts_id() {
        return contacts_id;
    }

    public void setContacts_id(UUID contacts_id) {
        this.contacts_id = contacts_id;
    }

    public UUID getCv_id() {
        return cv_id;
    }

    public void setCv_id(UUID cv_id) {
        this.cv_id = cv_id;
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

    public UUID getPreferences_id() {
        return preferences_id;
    }

    public void setPreferences_id(UUID preferences_id) {
        this.preferences_id = preferences_id;
    }
}
