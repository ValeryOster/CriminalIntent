package de.valeryoster.criminalintent;

import java.util.UUID;

/**
 * Created by Aleksejew on 26.05.15.
 */
public class Crime {
    private UUID mID;
    private String mTitle;

    public UUID getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Crime()
    {
        mID = UUID.randomUUID();
    }
}
