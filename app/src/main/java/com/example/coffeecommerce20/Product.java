package com.example.coffeecommerce20;

public class Product {
    private String mThumbnail;
    private String mTitle;
    private String mPrice;
    private int mCount;
    private String mDescription;

    public String getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(String mThumbnail) {
        this.mThumbnail = mThumbnail;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getPrice() {
        return mPrice;
    }

    public void setPrice(String mPrice) {
        this.mPrice = mPrice;
    }

    public int getCount() {
        return mCount;
    }

    public void setCount(int mCount) {
        this.mCount = mCount;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }
}
