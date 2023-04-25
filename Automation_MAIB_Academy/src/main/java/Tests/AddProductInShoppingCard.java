package Tests;

import Common.CommonElements;
import Hooks.Hook;
import Pages.CheckoutYourInformationPage;
import Pages.LoginPage;
import Pages.SwagLabsPage;
import Pages.YourCartPage;
import Steps.AssertionsMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import static Pages.YourCartPage.itemName;
import static Steps.AssertionsMethods.elementContainsText;

import static org.testng.AssertJUnit.assertTrue;

public class AddProductInShoppingCard extends Hook {
    LoginTest loginTest = new LoginTest();


    @Test
    public void addToCart() {
        SwagLabsPage swagLabsPage = PageFactory.initElements(driver, SwagLabsPage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.typeInUserNameField("standard_user");
        loginPage.typeInUserPasswordField("secret_sauce");
        loginPage.clickLoginButton();
        swagLabsPage.clickAddCard("test.allthethings()-t-shirt-(red)");
        swagLabsPage.clickShoppingCartButton();
        Assert.assertTrue(driver.getPageSource().contains("This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton."));

    }

    @Test
    public void removeProductAndContinueShopping() {
        YourCartPage yourCartPage = PageFactory.initElements(driver, YourCartPage.class);
        CheckoutYourInformationPage checkoutYourInformationPage = PageFactory.initElements(driver, CheckoutYourInformationPage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        SwagLabsPage swagLabsPage = PageFactory.initElements(driver, SwagLabsPage.class);
        loginPage.typeInUserNameField("standard_user");
        loginPage.typeInUserPasswordField("secret_sauce");
        loginPage.clickLoginButton();
        swagLabsPage.clickAddCard("test.allthethings()-t-shirt-(red)");
        swagLabsPage.clickShoppingCartButton();
        yourCartPage.clickRemoveButton("test.allthethings()-t-shirt-(red)");
        yourCartPage.clickContinueShopping();
        assertTrue(driver.getTitle().contains("Swag Labs"));

    }

    @Test
    public void checkInformation() {
        CheckoutYourInformationPage checkoutYourInformationPage = PageFactory.initElements(driver, CheckoutYourInformationPage.class);
        YourCartPage yourCartPage = PageFactory.initElements(driver, YourCartPage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        CommonElements commonElements = PageFactory.initElements(driver, CommonElements.class);
        SwagLabsPage swagLabsPage = PageFactory.initElements(driver, SwagLabsPage.class);
        loginPage.typeInUserNameField("standard_user");
        loginPage.typeInUserPasswordField("secret_sauce");
        loginPage.clickLoginButton();
        swagLabsPage.clickAddCard("test.allthethings()-t-shirt-(red)");
        swagLabsPage.clickShoppingCartButton();
        yourCartPage.clickCheckoutButton();
        checkoutYourInformationPage.enterFirsName("standard_user");
        checkoutYourInformationPage.enterLastName("standard_user");
        checkoutYourInformationPage.enterPostalCode("123");
        commonElements.clickContinueButton();
        elementContainsText(commonElements.description, "Payment Information\n" +
                "SauceCard #31337\n" +
                "Shipping Information\n" +
                "Free Pony Express Delivery!\n" +
                "Price Total\n" +
                "Item total: $15.99\n" +
                "Tax: $1.28\n" +
                "Total: $17.27");
        commonElements.clickFinishButton();
        Assert.assertTrue(driver.getPageSource().contains("Your order has been dispatched, and will arrive just as fast as the pony can get there!"));
        commonElements.backHome();
        assertTrue(driver.getTitle().contains("Swag Labs"));
    }
}
