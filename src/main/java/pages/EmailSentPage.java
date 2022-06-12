package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
    private WebDriver driver;

    //Element Locator Section
    private By contentArea = By.id("content");

    //Constructor to pass driver
    public EmailSentPage(WebDriver driver){
        this.driver = driver;
    }

    //Methods
    public String getMessage(){
        return driver.findElement(contentArea).getText();
    }

}
