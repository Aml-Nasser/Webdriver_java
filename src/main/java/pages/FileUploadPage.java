package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;

    //Element Locator Section
    private By inputFile = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");

    //Constructor to pass driver
    public FileUploadPage(WebDriver driver){
        this.driver=driver;
    }

    //Methods
    public void clickUploadButton(){
        driver.findElement(inputFile).click();
    }

    /**
     * Provide path of file to the form then clicks upload button
     * @param absolutePathFile the complete path of the file to upload
     */
    public void uploadFile(String absolutePathFile){
        driver.findElement(inputFile).sendKeys(absolutePathFile);
        clickUploadButton();
    }

    public String getUploadedFile(){
        return driver.findElement(uploadedFiles).getText();
    }


}
