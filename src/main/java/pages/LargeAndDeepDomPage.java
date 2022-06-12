package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LargeAndDeepDomPage {
    WebDriver driver;

    //Element Locator Section
    private By tableField = By.id("large-table");

    //Constructor to pass driver
    public LargeAndDeepDomPage(WebDriver driver){
        this.driver=driver;
    }

    //Methods
    public void scrollToTable(){
        WebElement tableElement = driver.findElement(tableField);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, tableElement);
    }


}
