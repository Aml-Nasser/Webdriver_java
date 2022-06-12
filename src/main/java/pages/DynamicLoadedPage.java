package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadedPage {
    WebDriver driver;

    //Element Locator Section
    //The two link have the same link format so i will make is general then specify for each
    private String linkXpath_Formate = "//a[contains(text(), '%s')]";
    private By link_Example1 = By.xpath(String.format(linkXpath_Formate, "Example 1"));
    private By link_Example2 = By.xpath(String.format(linkXpath_Formate, "Example 2"));

    //Constructor to pass driver
    public DynamicLoadedPage (WebDriver driver){
        this.driver=driver;
    }

    //Methods

    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExample1Page(driver);
    }
    public DynamicLoadingExample2Page clickExample2(){
        driver.findElement(link_Example2).click();
        return new DynamicLoadingExample2Page(driver);
    }
}
