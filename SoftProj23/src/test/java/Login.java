

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.UserInfo;
import org.example.UserMethodReg;


import java.util.ArrayList;
import static org.junit.Assert.assertTrue;

public class Login {

    UserInfo o;
    public static UserMethodReg userMethod = new UserMethodReg();
    boolean actual = false;

    public Login() {
        super();
        o = new UserInfo();
    }

    private static ArrayList<UserInfo> oww = new ArrayList<UserInfo>();

    void information() {
        UserInfo ow = new UserInfo( "dimaEid", "123");
        userMethod.usersInfo.add(ow);
        oww.add(ow);
    }

    @Given("the user is not logged in")
    public void the_user_is_not_logged_in() {
        System.out.println("The User Is Not Logged In");
    }


    @When("The user has entered the data correctly  {string} and {string}")
    public void the_user_has_entered_the_data_correctly_and(String string, String string2) {
        information();
        actual = UserMethodReg.userLoginCheck(string, string2);

    }

    @Then("the user is logged in")
    public void the_user_is_logged_in() {
        assertTrue(actual);
    }

    @When("username is {string} and password is {string}")
    public void username_is_and_password_is(String username, String password) {
        actual = userMethod.userLoginCheck(username, password);
    }

    @Then("the user login fails")
    public void the_user_login_fails() {
        assertTrue(!actual);
    }


}
