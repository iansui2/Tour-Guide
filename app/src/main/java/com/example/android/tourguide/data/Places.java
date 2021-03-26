package com.example.android.tourguide.data;

public class Places {
    private int mTitleId;

    private int mDescriptionId;

    private int mLocationId;

    private int mImageResourceId;

    private int mSourceLinkId;

    public Places(int titleId, int descriptionId, int locationId, int imageResourceId, int sourceLinkId) {
        mTitleId = titleId;
        mDescriptionId = descriptionId;
        mLocationId = locationId;
        mImageResourceId = imageResourceId;
        mSourceLinkId = sourceLinkId;
    }

    public int getTitleId() { return mTitleId; }

    public int getDescriptionId() { return mDescriptionId; }

    public int getLocationId() { return mLocationId; }

    public int getImageResourceId() { return mImageResourceId; }

    public int getSourceLinkId() { return mSourceLinkId; }
}
