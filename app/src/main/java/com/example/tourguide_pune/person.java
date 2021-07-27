package com.example.tourguide_pune;

public class person {

    int image;
    String name;
    String des;
    String visit;

    public person(int image, String name, String des, String visit) {
        this.image = image;
        this.name = name;
        this.des = des;
        this.visit = visit;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getVisit() {
        return visit;
    }

    public void setVisit(String visit) {
        this.visit = visit;
    }
}
