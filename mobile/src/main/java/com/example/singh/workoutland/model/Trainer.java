package com.example.singh.workoutland.model;

/**
 * Author: singh on: 17-May-18.
 */
public class Trainer {

    String name;
    String profileImage;
    String email;
    String website;

    public Trainer(String name, String profileImage, String email, String website) {
        this.name = name;
        this.profileImage = profileImage;
        this.email = email;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
