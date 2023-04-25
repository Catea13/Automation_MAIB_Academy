package Steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;


public class AssertionsMethods {
    WebDriver driver;

    public static void checkIfButtonIsClicked(WebElement button) {

        Assert.assertEquals(true, button.isSelected());
    }

    public static void elementContainsText(WebElement element, String text) {
        String textExpected = element.getText();
        Assert.assertTrue(textExpected.contains(text), "Actual text is" + textExpected + "but expected text is" + text);

    }

    public static void elementDisplayed(WebElement element) {
        Assert.assertTrue(element.isDisplayed());

    }

}

