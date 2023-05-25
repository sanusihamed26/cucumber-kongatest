package StepsDefinitions;

import PageFactory.LoginPage_Pf;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsForKongaTest {

    WebDriver driver = null;

    //importing page factory model
    LoginPage_Pf logga;

    // cucumber scenairo: Given
    @Given("user is on the konga homepage")
    // initiating web browser
    public void user_is_on_the_konga_homepage() throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\Cucumber\\src\\drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();

        driver.get("https://www.konga.com");
        Thread.sleep(30000);


    }
    // cucumber scenario: And
    @And("user clicks on the login/signup button")

    // user clicks on login/signup button
    public void user_clicks_on_the_login_signup_button() throws InterruptedException {
    logga.loginSignup();
    Thread.sleep(30000);
    }

    //cucumber Scenario: When
    @When("user enters username and password")

    // user enters username and password
    public void user_enters_username_and_password() throws InterruptedException {
        logga.enterEmailAddress();
        logga.enterPassword();
        Thread.sleep(5000);
    }

    // cucumber scenario: And
    @And("user clicks on the submit button")

    // user clicks on the submit button
    public void user_clicks_on_the_submit_button() throws InterruptedException {
    logga.clickLogin();
    Thread.sleep(30000);
    }

    // cucumber scenario : Then
    @Then("user select the items and checkout successfully")
    // user selects an item and checkout successfully
    public void user_select_the_items_and_checkout_successfully() throws InterruptedException {

      //user clicks on computer and accessories button
     logga.clickcomputer();
    Thread.sleep(30000);

    // user clicks on laptop option
    logga.clicklaptop();
        Thread.sleep(10000);

        //user clicks on applemacbook option
    logga.clickapplemacbooks();
        Thread.sleep(30000);

        // user clicks on the item to be selected
    logga.selectitem();
        Thread.sleep(10000);

        //user clicks on mycart button
    logga.mycart();
        Thread.sleep(10000);

        // user clicks on checkout option
    logga.checkout();
        Thread.sleep(10000);

        // close the browser
        driver.close();
    }

}
