package com.example.student.myprojekct.models;

public class ModelCity {

    private int imageId;
    private String textName;
    private String textDescription;

    public ModelCity(int imageId, String textName, String textDescription) {
        this.imageId = imageId;
        this.textName = textName;
        this.textDescription = textDescription;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTextName() {
        return textName;
    }

    public void setTextName(String textName) {
        this.textName = textName;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

}
