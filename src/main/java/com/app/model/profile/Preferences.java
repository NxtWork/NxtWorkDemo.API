package com.app.model.profile;

import java.util.UUID;

public class Preferences {
    private UUID id;
    private boolean receive_emails;
    private boolean dark_theme;
    private boolean personal_recommendations;

    public Preferences(UUID id, boolean receive_emails, boolean dark_theme, boolean personal_recommendations) {
        this.id = id;
        this.receive_emails = receive_emails;
        this.dark_theme = dark_theme;
        this.personal_recommendations = personal_recommendations;
    }

    public boolean isReceive_emails() {
        return receive_emails;
    }

    public void setReceive_emails(boolean receive_emails) {
        this.receive_emails = receive_emails;
    }

    public boolean isDark_theme() {
        return dark_theme;
    }

    public void setDark_theme(boolean dark_theme) {
        this.dark_theme = dark_theme;
    }

    public boolean isPersonal_recommendations() {
        return personal_recommendations;
    }

    public void setPersonal_recommendations(boolean personal_recommendations) {
        this.personal_recommendations = personal_recommendations;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
