import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.House;
import org.example.Residence;
import org.example.ServiceMethod;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class View {

    protected static final List<Residence> residences = new ArrayList<>();
    static Residence rr = new Residence();

    private boolean b = false;

    Residence rT;
    House hT;
    public static ServiceMethod resTest = new ServiceMethod();
    public static ServiceMethod hosTest = new ServiceMethod();


    public View() {
        super();
        rT = new Residence();
        hT = new House();
    }

    private static ArrayList<Residence> rArrayTest = new ArrayList<Residence>();
    private static ArrayList<House> hArrayTest = new ArrayList<House>();



    void resInfo() {
        Residence ow = new Residence("50","999","Rafedia Street",10,"electricity",20);
        resTest.residences.add(ow);
        rArrayTest.add(ow);
    }

    void hosInfo() {
        House hhow = new House("501","50",  "2", "600" ,  "western" ,  2 ,  6);
        hosTest.houses.add(hhow);
        hArrayTest.add(hhow);
    }

    @Given("The owner chose view")
    public void the_owner_chose_view() {
    }
    @When("The owner click view Resident")
    public void the_owner_click_view_resident() {
        resInfo();
        b= resTest.viewResidences();
    }
    @Then("Resident list is shown")
    public void resident_list_is_shown() {
        assertTrue(b);
    }

    @When("The owner click view ResidentId")
    public void the_owner_click_view_resident_id() {
        resInfo();
        b= resTest.viewResidenceID();
    }

    @Then("ResidentID list is shown")
    public void resident_id_list_is_shown() {
        assertTrue(b);
    }

    @When("The owner click view house")
    public void the_owner_click_view_house() {
       hosInfo();
       b=hosTest.viewHouses();
    }

    @Then("house list is shown")
    public void house_list_is_shown() {
        assertTrue(b);
    }

}
