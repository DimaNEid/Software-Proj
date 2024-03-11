import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.UserInfo;
import org.example.UserMethodReg;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class Signup {

    UserInfo uS;
    public static UserMethodReg userSign = new UserMethodReg();
    boolean signupResult = false;


    public Signup() {
        super();
        uS = new UserInfo();
    }

    private static ArrayList<UserInfo> oww = new ArrayList<UserInfo>();

    void informationCheck() {
        UserInfo ow = new UserInfo( "dimaEid", "123");
        userSign.usersInfo.add(ow);
        oww.add(ow);
    }


    @Given("The user is on the registration page")
    public void the_user_is_on_the_registration_page() {

    }



   @When("The user enters a username {string} and password {string}")
   public void the_user_enters_a_username_and_password(String u, String p) {
    informationCheck();
    signupResult = UserMethodReg.userSignUpCheck(u, p);
  }



    @Then("user signed up")
    public void user_signed_up_successfully() {
        assertTrue(signupResult);
    }


    @When("user enters  {string} and {string}")
    public void username_is_and_password_is(String u, String p) {
        informationCheck();
        signupResult = UserMethodReg.userSignUpCheck(u, p);
    }



    @Then("user connot sign up")
    public void user_sign_up_fails() {
        assertTrue(signupResult);
    }





}
