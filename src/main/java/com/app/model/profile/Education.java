package com.app.model.profile;

import java.util.UUID;

public class Education {
    private UUID id;
    private String institution;
    private String degree;
    private String duration;

    public Education(UUID id, String institution, String degree, String duration) {
        this.id = id;
        this.institution = institution;
        this.degree = degree;
        this.duration = duration;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
