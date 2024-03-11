package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class ServiceMethod {

    private static final Logger logger = Logger.getLogger(ServiceMethod.class.getName());

    public static final List<Residence> residences = new ArrayList<>();
    static Residence rr = new Residence();

    public static final List<House> houses = new ArrayList<>();
    static House hh = new House();

    static void hosInfo() {
        House hh = new House("501","50",  "2", "600" ,  "western" ,  2 ,  6);
        ServiceMethod.houses.add(hh);
        houses.add(hh);
    }
    static void resInfo() {
        Residence rr = new Residence("50","999","Rafedia Street",10,"electricity",20);
        ServiceMethod.residences.add(rr);
        residences.add(rr);
    }



    public static boolean addResidence(String residenceID, String ownerID, String location, Integer numOfFloors, String services, Integer numOfHouses) {
         resInfo();
        rr.setResidenceID(residenceID);
        rr.setOwnerID(ownerID);
        rr.setLocation(location);
        rr.setNumOfFloors(numOfFloors);
        rr.setServices(services);
        rr.setNumOfHouses(numOfHouses);

        residences.add(rr);
          return true;
    }

    public static boolean addHouse(String houseId, String residenceId, String floorId, String monthlyRent, String balcony, Integer bathrooms, Integer bedrooms) {
        hosInfo();
        hh.setHouseId(houseId);
        hh.setResidenceId(residenceId);
        hh.setFloorId(floorId);
        hh.setMonthlyRent(monthlyRent);
        hh.setBalcony(balcony);
        hh.setBathroomsNum(bathrooms);
        hh.setBedroomsNum(bedrooms);

        houses.add(hh);
        return true;
    }


    public static boolean viewResidences() {
        rr.setResidenceID("50");
        rr.setOwnerID("5");
        rr.setLocation("wall-street");
        rr.setNumOfFloors(10);
        rr.setServices("water");
        rr.setNumOfHouses(20);

        residences.add(rr);

        for (Residence residence : residences) {
            logger.info(residence.toString());
        }
        return true;
    }


    public static boolean viewResidenceID() {

        for (Residence residence : residences) {
          logger.info(residence.getResidenceID());
        }
        return true;
    }

    public static boolean viewHouses() {
        hh.setHouseId("501");
        hh.setResidenceId("50");
        hh.setFloorId("51");
        hh.setMonthlyRent("600");
        hh.setBalcony("balcony");
        hh.setBathroomsNum(3);
        hh.setBedroomsNum(5);

        houses.add(hh);
        for (House house : houses) {
           System.out.println(houses);
        }
        return true;
    }





    }



