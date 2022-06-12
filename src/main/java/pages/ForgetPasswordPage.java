package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {
    private WebDriver driver;

    //Element Locator Section
    private By emailField = By.id("email");
    private By retrieveButton = By.id("form_submit");

    //constructor to pass driver
    public ForgetPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    //Methods
    public void enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public EmailSentPage clickRetrieveButton(){
        driver.findElement(retrieveButton).click();
        return new EmailSentPage(driver);
    }

    public EmailSentPage retrievePassword(String email){
        enterEmail(email);
        return clickRetrieveButton();
    }
}
