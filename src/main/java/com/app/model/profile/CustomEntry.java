package com.app.model.profile;

import java.util.UUID;

public class CustomEntry {
    private UUID id;
    private String sectionName;
    private String value;

    public CustomEntry(UUID id, String sectionName, String value) {
        this.id = id;
        this.sectionName = sectionName;
        this.value = value;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
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
