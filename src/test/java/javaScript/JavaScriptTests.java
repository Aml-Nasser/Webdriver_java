package javaScript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollIntoTable(){
       var LargeAndDeepPage = homePage.clickLargeAndDeepDom();
        LargeAndDeepPage.scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        var InfiniteScrollPage = homePage.clickInfiniteScroll();
        InfiniteScrollPage.scrollToParagraph(5);

    }

}
