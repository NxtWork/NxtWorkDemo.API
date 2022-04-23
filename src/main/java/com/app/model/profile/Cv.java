package com.app.model.profile;

import java.util.List;
import java.util.UUID;

public class Cv {
    private UUID id;
    private String description;
    private UUID experience_id;
    private UUID education_id;
    private UUID interests_id;
    private UUID customEntries_id;

    public Cv(UUID id, String description, UUID experience_id, UUID education_id, UUID interests_id, UUID customEntries_id) {
        this.id = id;
        this.description = description;
        this.experience_id = experience_id;
        this.education_id = education_id;
        this.interests_id = interests_id;
        this.customEntries_id = customEntries_id;
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

    public UUID getExperience_id() {
        return experience_id;
    }

    public void setExperience_id(UUID experience_id) {
        this.experience_id = experience_id;
    }

    public UUID getEducation_id() {
        return education_id;
    }

    public void setEducation_id(UUID education_id) {
        this.education_id = education_id;
    }

    public UUID getInterests_id() {
        return interests_id;
    }

    public void setInterests_id(UUID interests_id) {
        this.interests_id = interests_id;
    }

    public UUID getCustomEntries_id() {
        return customEntries_id;
    }

    public void setCustomEntries_id(UUID customEntries_id) {
        this.customEntries_id = customEntries_id;
    }
}
