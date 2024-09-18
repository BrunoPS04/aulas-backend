package com.example.atControladores.model;

public enum Office {
   
    SALE("Sale"),
    VETERINARY("Veterinary"),
    SUPPORT("Support");

    private final String officeName;

    Office(String officeName) {
        this.officeName = officeName;
    }

    public String getOfficeName() {
        return officeName;
    }

}
