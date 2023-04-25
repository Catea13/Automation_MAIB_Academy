package Steps;

import Pages.LoginPage;
import Pages.SwagLabsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BaseSteps {
    protected WebDriver driver = new ChromeDriver();

    @Given("open the site")
    public void openTheSite() {
        driver.get("http://saucedemo.com/");
    }

    @When("fill in Name with {string}")
    public void fillInWith(String value) {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.typeInUserNameField(value);


    }

    @When("fill in {string} with {string}")
    public void fillInWith(String field, String value) {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        switch (field) {
            case "Name":
                loginPage.userNameField.sendKeys(value);
                break;
            case "Password":
                loginPage.passwordField.sendKeys(value);
                break;
            default:
                System.out.println("This field" + field + " " + "not existed");

        }
    }


    @And("click  {string} button")
    public void clickButton(String button) {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        switch (button) {
            case "Login":
                loginPage.clickLoginButton();
                break;

            default:
                System.out.println("This button" + button + " " + "not existed");
        }
    }


    @Then("appear next text {string}")
    public void appearNextText(String text) {
        Assert.assertTrue(driver.getPageSource().contains(text));
    }
}



