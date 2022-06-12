package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;

    //Element Locator Section
    public String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentButton = By.xpath("//div[@title='indentation']/button[@aria-label='Increase indent']");


    //Constructor to pass driver
    public WysiwygEditorPage (WebDriver driver){
        this.driver=driver;
    }

    //Methods

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void increaseIndention(){
        driver.findElement(increaseIndentButton).click();
    }

    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    //No need to use it outside this class (Test class) only can access this iframe tags
    //you need to exit this iFrame after finishing (To avoid stuck there)
    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);
    }
    //exist iFrame
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }


}
