package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;

    //Element Locator Section
    private By inputField = By.id("target");
    private By resultField = By.id("result");

    //Constructor to pass driver
    public KeyPressesPage (WebDriver driver){
        this.driver=driver;
    }
    //Methods
    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public void enterPi(){
        enterText(Keys.chord(Keys.CONTROL, "v") + "=3.14");
    }

    public String getResult(){
        return driver.findElement(resultField).getText();
    }
}
