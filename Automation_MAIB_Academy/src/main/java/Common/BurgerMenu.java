package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BurgerMenu {
    private WebDriver driver;
    private static final String itemBurgerMenu = "//*[@id=\"%s\"_sidebar_link";
    @FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]")
    WebElement burgerMenu;
    @FindBy(xpath = "//*[@id=\"react-burger-cross-btn\"]")
    WebElement crossButton;

    public BurgerMenu(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBurgerMenu() {
        burgerMenu.click();
    }

    public void chooseItemFromBurgerMenu(String item) {
        driver.findElement(By.xpath(String.format(itemBurgerMenu, item))).click();
    }

    public void closeBurgerMenu() {
        crossButton.click();
    }
}
