package com.app.model.common;

import java.util.UUID;

public class Contacts {
    private UUID id;
    private String phone;
    private String email;
    private String address;

    ////FOR TESTING
    public Contacts(String phone, String email, String address) {
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
    ////

    public Contacts(UUID id, String phone, String email, String address) {
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Contacts() {}

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "tel.='" + phone + '\'' +
                ", e-pasts='" + email + '\'' +
                ", adrese='" + address + '\'';
    }
}
