package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample2Page {
    WebDriver driver;

    //Element Locator Section
    private By startButton = By.cssSelector("#start button");
    private By loadedText = By.id("finish");

    //Constructor to pass driver
    public DynamicLoadingExample2Page (WebDriver driver){
        this.driver=driver;
    }

    //Methods

    public void clickStartButton(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));
    }

    public boolean isStartButtonDisplayed(){
        return driver.findElement(startButton).isDisplayed();
    }

    public String getLoadedTex(){
        return driver.findElement(loadedText).getText();
    }
}
