import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.*;

import java.util.ArrayList;
import static org.junit.Assert.assertTrue;

public class AddPersonInfo {

    String id,name,phone,address;

    private boolean b = false;

    Owner oT;
    Tenant tT;
    Admin  aT;
    public static PersonsMethod perTest = new PersonsMethod();


    public AddPersonInfo() {
        super();
        oT = new Owner();
        tT = new Tenant();
        aT = new Admin();
    }

    private static ArrayList<Owner> oArrayTest = new ArrayList<Owner>();
    private static ArrayList<Tenant> tArrayTest = new ArrayList<Tenant>();
    private static ArrayList<Admin> aArrayTest = new ArrayList<Admin>();

    void ownerInfo() {
        Owner ow = new Owner( "222", "Dima", "0599632458", "wall street");
        perTest.owners.add(ow);
        oArrayTest.add(ow);
    }
    void tenatInfo() {
        Tenant te = new Tenant( "333", "Raya", "059952478", "Lore street");
        perTest.tenants.add(te);
        tArrayTest.add(te);
    }
    void adminInfo() {
        Admin ad = new Admin( "444", "Kamal", "0599632458", "baker street");
        PersonsMethod.admin.add(ad);
        aArrayTest.add(ad);
    }


    @Given("user chose to add his information")
    public void user_chose_to_add_his_information() {}

    @When("owner adds his information")
    public void owner_adds_his_information() {
        ownerInfo();
        b=PersonsMethod.addOwner( id,name,phone,address);
    }
    @Then("owner info are added")
    public void owner_info_are_added() {
        assertTrue(b);
    }
    @When("tenant adds his information")
    public void tenant_adds_his_information() {
     tenatInfo();
     b=PersonsMethod.addTenant(id,name,phone,address);
    }
    @Then("tenant info are added")
    public void tenant_info_are_added() {
        assertTrue(b);
    }
    @When("admin adds his information")
    public void admin_adds_his_information() {
     adminInfo();
     b=PersonsMethod.addAdmin(id,name,phone,address);

    }
    @Then("admin info are added")
    public void admin_info_are_added() {
        assertTrue(b);

    }

}
