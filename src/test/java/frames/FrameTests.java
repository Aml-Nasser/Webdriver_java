package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FrameTests extends BaseTests {
    @Test
    public void testWysiwyg(){
        var framePage = homePage.clickWysiwygEditor();
        framePage.clearTextArea();
        String text1 = "Hello ";
        String text2 = "World";
        framePage.setTextArea(text1);
        framePage.increaseIndention();
        framePage.setTextArea(text2);
        assertEquals(framePage.getTextFromEditor(), text1+text2 , "incorrect text");

    }
}
