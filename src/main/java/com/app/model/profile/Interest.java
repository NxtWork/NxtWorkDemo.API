package com.app.model.profile;

import java.util.UUID;

public class Interest {
    private UUID id;
    private String interestText;

    public Interest(UUID id, String interestText) {
        this.id = id;
        this.interestText = interestText;
    }

    public String getInterestText() {
        return interestText;
    }

    public void setInterestText(String interestText) {
        this.interestText = interestText;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
