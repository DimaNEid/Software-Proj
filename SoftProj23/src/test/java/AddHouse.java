import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.House;
import org.example.ServiceMethod;

import java.util.ArrayList;


import static org.junit.Assert.assertTrue;

public class AddHouse {

    private boolean b = false;

    House rT;
    public static ServiceMethod resTest = new ServiceMethod();




    public AddHouse() {
        super();
        rT = new House();
    }

    private static final ArrayList<House> rArrayTest = new ArrayList<House>();

    void resInfo() {
        House ow = new House("501","50",  "2", "600" ,  "western" ,  2 ,  6);
        ServiceMethod.houses.add(ow);
        rArrayTest.add(ow);
    }

    @Given("The owner wants to add House")
    public void the_owner_wants_to_add_house() {

    }
    @When("The owner enters House_id {string}, Resident_Id {string}, floor_Id {string},monthlyRent {string} , balcony {string} , bathrooms {int} , bedrooms {int}")
    public void the_owner_enters_house_id_resident_id_floor_id_monthly_rent_balcony_bathrooms_bedrooms(String House_id, String Resident_Id, String floor_Id, String monthlyRent, String balcony, Integer bathrooms, Integer bedrooms) {
        resInfo();
        b= resTest.addHouse( House_id,  Resident_Id,  floor_Id,  monthlyRent,  balcony,  bathrooms,bedrooms);
    }
    @Then("House added")
    public void house_added() {
        assertTrue(b);
    }
}
