package Steps;

import Hooks.Hook;
import Hooks.TestContext;
import Pages.LoginPage;
import Pages.SwagLabsPage;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.And;

public class ShoppingSteps {
    private TestContext testContext;

    public ShoppingSteps(TestContext testContext) {
        this.testContext = testContext;
    }


    @And("user add the product in the cart")
    public void userAddTheProductInTheCart() {

        SwagLabsPage swagLabsPage = PageFactory.initElements(testContext.getHook().driver, SwagLabsPage.class);

        swagLabsPage.clickAddCard("test.allthethings()-t-shirt-(red)");
        swagLabsPage.clickShoppingCartButton();
    }
}
