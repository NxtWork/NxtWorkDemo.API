package com.app.model.jobs;

import java.util.UUID;

public class Requirement {
    private UUID id;
    private String key;
    private String value;

    ////FOR TESTING
    public Requirement(String key, String value) {
        this.key = key;
        this.value = value;
    }
    ////


    public Requirement(UUID id, String key, String value) {
        this.id = id;
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
