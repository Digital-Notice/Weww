package com.example.iknownothing.weww;

public class Model {

    private int image;
    private String title;
    private String date;
    private String time;
    private String venue;
    private String details;
    private String updatedBy;

    public Model(int image, String title, String date, String time, String venue, String details, String updatedBy) {
        this.image = image;
        this.title = title;
        this.date = date;
        this.time = time;
        this.venue = venue;
        this.details = details;
        this.updatedBy = updatedBy;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
