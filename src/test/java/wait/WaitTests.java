package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import static  org.testng.Assert.*;

public class WaitTests extends BaseTests {
    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoaded().clickExample1();
        loadingPage.clickStartButton();
        assertEquals(loadingPage.getLoadedTex(), "Hello World!", "Incorrect Text");
    }

    @Test
    public void testWaitUntilVisible(){
        var loadingPage = homePage.clickDynamicLoaded().clickExample2();
        loadingPage.clickStartButton();
        loadingPage.isStartButtonDisplayed();
        assertEquals(loadingPage.getLoadedTex(), "Hello World!", "Incorrect Text");
    }
}
