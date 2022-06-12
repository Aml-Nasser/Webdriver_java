package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;

    //Element Locator Section
    private By slider = By.tagName("input");
    private By sliderValue = By.id("range");

    //Constructor to pass driver
    public HorizontalSliderPage (WebDriver driver){
        this.driver=driver;
    }

    //Methods
    public void setSliderValue(String value){
        while(!getSliderValue().equals(value)) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getSliderValue(){
        return driver.findElement(sliderValue).getText();
    }

}
