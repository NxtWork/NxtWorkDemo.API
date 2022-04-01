package com.app.model.profile;

public class CustomEntry {
    private String sectionName;
    private String value;

    public CustomEntry(String sectionName, String value) {
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
}
