package com.example.tourguideapp;

public class Spot {
    private int spotImageID;
    private String spotName;
    private String spotDeclaration;

    public Spot(int spotImageID,String spotName,String spotDeclaration) {
        this.spotImageID = spotImageID;
        this.spotName = spotName;
        this.spotDeclaration = spotDeclaration;
    }

    public final int getSpotImageID() {
        return spotImageID;
    }

    public final String getSpotName() {
        return spotName;
    }

    public final String getSpotDeclaration() {
        return spotDeclaration;
    }
}
