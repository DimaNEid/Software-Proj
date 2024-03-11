import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.House;
import org.example.Residence;
import org.example.ServiceMethod;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AddResidenceInfo {

    private boolean b = false;


    Residence rT;
    public static ServiceMethod resTest = new ServiceMethod();


    public AddResidenceInfo() {
        super();
        rT = new Residence();
    }

    private static ArrayList<Residence> rArrayTest = new ArrayList<Residence>();
    private static ArrayList<House> hArrayTest = new ArrayList<House>();

    void resInfo() {
        Residence ow = new Residence("50","999","Rafedia Street",10,"electricity",20);
        resTest.residences.add(ow);
        rArrayTest.add(ow);
    }
    @Given("The owner is logged in")
    public void the_owner_is_logged_in() {

    }

    @When("The owner enters ResidentId {string}, ownerId {string}, location {string}, numOfFloors {int} , services {string}, numOfHouses {int}")
    public void the_owner_enters_resident_id_owner_id_location_num_of_floors_services_num_of_houses(String residenceID, String ownerID, String location, Integer numOfFloors, String services, Integer numOfHouses) {
        resInfo();
        b= resTest.addResidence( residenceID,  ownerID,  location,  numOfFloors,  services,  numOfHouses);
    }
    @Then("The data is added")
    public void the_data_is_added() {
        assertTrue(b);

    }
}
