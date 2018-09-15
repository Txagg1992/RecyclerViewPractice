package com.curiousca.recyclerviewpractice;

public class ExampleItem {

    private String mImageURL;
    private String mCreator;
    private int mLikes;

    public ExampleItem(String imageURL, String creator, int likes) {
        this.mImageURL = imageURL;
        this.mCreator = creator;
        this.mLikes = likes;
    }

    public String getImageURL() {
        return mImageURL;
    }

    public String getCreator() {
        return mCreator;
    }

    public int getLikeCount() {
        return mLikes;
    }
}
