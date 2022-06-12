package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TheInternetQuiz {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        //driver.manage().window().fullscreen();
        //driver.manage().window().setSize(new Dimension(375,812));
        driver.manage().window().maximize();
        WebElement firstLink = driver.findElement(By.linkText("Shifting Content"));
        firstLink.click();
        WebElement secondLink = driver.findElement(By.linkText("Example 1: Menu Element"));
        secondLink.click();
        List<WebElement> listLinks = driver.findElements(By.xpath("//ul/li"));
        System.out.println(listLinks.size());
        driver.quit();

    }

    public static void main(String args[]){
        TheInternetQuiz test = new TheInternetQuiz();
        test.setUp();
    }

}
