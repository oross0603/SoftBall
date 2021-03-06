package com.csc445.omie.softball;

import java.util.UUID;

/**
 * Created by Omie on 6/1/2017.
 */

public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
        // Generates unique identifier
        mId = UUID.randomUUID();
    }

    public UUID getID() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
