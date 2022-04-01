package com.app.model.profile;

public class Education {
    private String institution;
    private String degree;
    private String duration;

    public Education(String institution, String degree, String duration) {
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
}
