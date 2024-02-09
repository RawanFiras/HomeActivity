package edu.cs.birzeit.homeactivity;

public class Apartment {

    private int imageResource;
    private String apartmentInfo;
    private String apartmentEvaluation;

    public Apartment(int imageResource, String apartmentInfo, String apartmentEvaluation) {
        this.imageResource = imageResource;
        this.apartmentInfo = apartmentInfo;
        this.apartmentEvaluation = apartmentEvaluation;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getApartmentInfo() {
        return apartmentInfo;
    }

    public String getApartmentEvaluation() {
        return apartmentEvaluation;
    }
}
