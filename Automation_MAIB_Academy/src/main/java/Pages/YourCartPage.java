package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartPage {
    private WebDriver driver;
    public static final String itemName = "//*[text()='\"%s\"']";
    private static final String remove = "//*[@id=\"remove-%s\"]";
    String text;
    @FindBy(id = "checkout")
    WebElement checkoutButton;
    @FindBy(id = "continue-shopping")
    WebElement continueShopping;

    public YourCartPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickItemName(String text) {
        driver.findElement(By.xpath(String.format(itemName, text))).click();

    }

    public void clickRemoveButton(String text) {
        driver.findElement(By.xpath(String.format(remove, text)));

    }

    public void clickCheckoutButton() {
        checkoutButton.click();
    }

    public void clickContinueShopping() {
        continueShopping.click();
    }
}
