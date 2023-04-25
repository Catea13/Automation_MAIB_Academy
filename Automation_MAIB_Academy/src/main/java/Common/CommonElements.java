package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CommonElements {
    private WebDriver driver;
    @FindBy(id = "cancel")
    WebElement cancelButton;
    @FindBy(id = "continue")
    WebElement continueButton;
    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]")
    public WebElement description;
    @FindBy(xpath = "//*[@id=\"finish\"]")
    WebElement finishButton;
    @FindBy(id = "back-to-products")
    WebElement backHomeButton;

    public CommonElements(WebDriver driver) {

        this.driver = driver;
    }

    public void clickCancelButton() {
        cancelButton.click();

    }

    public void clickContinueButton() {
        continueButton.click();
    }

//    public void descriptionHasText(String text) {
//        Assert.assertTrue(description.getText().contains(text));
//    }

    public void clickFinishButton() {
        finishButton.click();
    }

    public void backHome() {
        backHomeButton.click();
    }
}
