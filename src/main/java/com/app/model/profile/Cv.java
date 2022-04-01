package com.app.model.profile;

import java.util.List;
import java.util.UUID;

public class Cv {
    private UUID id;
    private String description;
    private List<Experience> experience;
    private List<Education> education;
    private List<Interest> interests;
    private List<CustomEntry> customEntries;

    public Cv(UUID id, String description, List<Experience> experience, List<Education> education, List<Interest> interests, List<CustomEntry> customEntries) {
        this.id = id;
        this.description = description;
        this.experience = experience;
        this.education = education;
        this.interests = interests;
        this.customEntries = customEntries;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Experience> getExperience() {
        return experience;
    }

    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }

    public List<Education> getEducation() {
        return education;
    }

    public void setEducation(List<Education> education) {
        this.education = education;
    }

    public List<Interest> getInterests() {
        return interests;
    }

    public void setInterests(List<Interest> interests) {
        this.interests = interests;
    }

    public List<CustomEntry> getCustomEntries() {
        return customEntries;
    }

    public void setCustomEntries(List<CustomEntry> customEntries) {
        this.customEntries = customEntries;
    }
}
