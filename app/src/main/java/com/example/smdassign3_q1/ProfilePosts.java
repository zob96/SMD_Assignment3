package com.example.smdassign3_q1;

public class ProfilePosts {
    private int image;
    String contactName;
    String contactNumber;
    String contactEmail;

    public ProfilePosts(int image, String cName, String cNumber, String cEmail) {
        this.image = image;
        this.contactName = cName;
        this.contactNumber = cNumber;
        this.contactEmail = cEmail;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}