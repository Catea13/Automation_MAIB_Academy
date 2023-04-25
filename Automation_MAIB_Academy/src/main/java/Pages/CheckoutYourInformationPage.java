package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutYourInformationPage {
    private WebDriver driver;
    @FindBy(id = "first-name")
    WebElement firstNameField;
    @FindBy(id = "last-name")
    WebElement lastNameField;
    @FindBy(id = "postal-code")
    WebElement postalCodeField;

    public CheckoutYourInformationPage(WebDriver driver) {

        this.driver = driver;
    }

    public void enterFirsName(String name) {
        firstNameField.sendKeys(name);

    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void enterPostalCode(String code) {
        postalCodeField.sendKeys(code);
    }
}