package alert;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests {
    @Test
    public void tesTFileUpload(){
        var fileUploadPage = homePage.clickFileUpload();
        //fileUploadPage.uploadFile("C:\Users\Aml\Desktop\ITI.txt");
        String text = "ITI.txt";
        assertEquals(fileUploadPage.getUploadedFile(), text, "incorrect file");
    }
}
