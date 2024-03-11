import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.UserInfo;
import org.example.UserMethodReg;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class AddUser {

    UserInfo adu;
    public static UserMethodReg userMethod = new UserMethodReg();
    boolean addResult = false;

    public AddUser() {
        super();
        adu = new UserInfo();
    }

    private static ArrayList<UserInfo> oww = new ArrayList<UserInfo>();

    void addInfo() {
        UserInfo ow = new UserInfo( "username", "password");
        userMethod.usersInfo.add(ow);
        oww.add(ow);
    }
    @Given("The user created an account")
    public void the_user_created_an_account() {

    }
    @When("The user provides {string} and {string}")
    public void the_user_provides_and(String username, String password) {
        addInfo();
        addResult = UserMethodReg.userLoginCheck(username, password);

    }
    @Then("The user Information are added")
    public void the_user_information_are_added() {
        assertTrue(!addResult);
    }

}
