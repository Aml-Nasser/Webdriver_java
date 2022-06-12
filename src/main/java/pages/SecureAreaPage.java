package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;
    //Element Locator Section
    private By statusAlert = By.id("flash");

    //constructor to pass driver
    public SecureAreaPage(WebDriver driver){
        this.driver=driver;
    }

    //Methods
    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }

}
