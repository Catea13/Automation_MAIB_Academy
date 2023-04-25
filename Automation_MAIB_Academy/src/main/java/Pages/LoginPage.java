package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    @FindBy(id = "user-name")
    public WebElement userNameField;
    @FindBy(id = "password")
    public WebElement passwordField;
    @FindBy(id = "login-button")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public void typeInUserNameField(String name) {
        userNameField.sendKeys(name);
    }

    public void typeInUserPasswordField(String password) {
        passwordField.sendKeys(password);


    }

    public void clickLoginButton() {
        loginButton.click();
    }
}

