package org.example;

public class Residence {



    private String  residenceID;
    private String ownerID;
    private String location;
    private String services;
    private Integer numOfFloors;
    private Integer numOfHouses;

    public Residence() {

    }

    public void setNumOfFloors(Integer numOfFloors){this.numOfFloors=numOfFloors;}

    public String getResidenceID() {return residenceID;}

    public void setResidenceID(String residenceID) {this.residenceID = residenceID;}

    public void setOwnerID(String ownerID) {this.ownerID = ownerID;}

    public void setLocation(String location) {this.location = location;}

    public void setServices(String services) {this.services = services;}

    public void setNumOfHouses(Integer numOfHouses) {this.numOfHouses = numOfHouses;}


    public Residence(String residenceID, String ownerID, String location, Integer numOfFloors,String services,Integer numOfHouses ) {
        this.residenceID = residenceID;
        this.ownerID = ownerID;
        this.location = location;
        this.numOfFloors = numOfFloors;
        this.services = services;
        this.numOfHouses = numOfHouses;
    }

    @Override
    public String toString() {
        return "Residence{" +
                "ID " + residenceID +
                ", OwnerId '" + ownerID + '\'' +
                ", location '" + location + '\'' +
                ", number Of Floors '" + numOfFloors + '\'' +
                ", services " + services + '\''+
                ", number Of Houses " + numOfHouses + '\''+
                '}';
    }


}

