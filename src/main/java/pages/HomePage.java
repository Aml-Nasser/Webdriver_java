package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.PortUnreachableException;

public class HomePage {
    private WebDriver driver;
    //Element Locator Section
    //private By formAuthenticationLink = By.linkText("Form Authentication");
    //private By dropdownLink = By.linkText("Dropdown");

    //constructor to pass driver
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    //Methods
    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public ForgetPasswordPage clickForgetPassword(){
        clickLink("Forgot Password");
        return new ForgetPasswordPage(driver);
    }

    public HoverPage clickHover(){
        clickLink("Hovers");
        return new HoverPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage (driver);
    }

    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditor (){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public DynamicLoadedPage clickDynamicLoaded(){
        clickLink("Dynamic Loading");
        return new DynamicLoadedPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    //Private to disable our tests from calling it

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
