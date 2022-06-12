package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class SliderTests extends BaseTests {

    @Test
    public void testSliderValue(){
        var sliderPage = homePage.clickHorizontalSlider();
        String value = "4";
        sliderPage.setSliderValue(value);
        assertEquals(sliderPage.getSliderValue(),value, "Value is incorrect");
    }
}
