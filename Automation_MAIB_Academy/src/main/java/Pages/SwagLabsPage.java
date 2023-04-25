package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabsPage {
    private WebDriver driver;


    private static final String addToCardButton = "//*[@id=\"add-to-cart-%s\"]";

    private static final String productItem = "//*[text()='\"%s\']";


    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]")
    WebElement shoppingCartButton;
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div/span/select")
    WebElement productSortContainer;

    public SwagLabsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddCard(String item) {
        driver.findElement(By.xpath(String.format(addToCardButton, item))).click();
    }

    public void chooseProductItemFromSwagLabsPage(String text) {
        driver.findElement(By.xpath(String.format(productItem, text))).click();
    }

    public void clickShoppingCartButton() {
        shoppingCartButton.click();
    }

    public void clickProductSortContainer() {
        productSortContainer.click();
    }

}

