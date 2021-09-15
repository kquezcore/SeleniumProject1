package com.cybertek.tests.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class YahooSearchPageTest {
    WebDriver driver ;

    @BeforeAll
    public static void setUpDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setupWebDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }

    @AfterAll
    public static void teardown(){
        System.out.println("@After all , nothing to do here");
    }
    // 2 test: navigate to https://seach.yahoo.com
    //test 1:testYahooSearchHomePageTitle
    //when you navigate to yahoo search page
    // the title should nbe "Yahoo search - web search "

    @Test
    public void testYahooSearchHomePageTitle(){



        String expectedTitle = "Yahoo Search - Web Search" ;
        String actualTitle = driver.getTitle();

        // quit the browser here , because we already saved the title

        // do static import, so you can do this
        // import static org.junit.jupiter.api.Assertions.*;
        assertEquals(expectedTitle,actualTitle ) ;

    }




    //Test 2:
    // test navigate yahoo page
    // and search for selenium
    // the page tittle should start with selenium


    @Test
    public void testYahooSearchResultPageTitle(){


        driver.get("https://search.yahoo.com/");


        //identify search box, enter selenium and hit enter key on keyboard
        WebElement searchBox= driver.findElement(By.xpath("//input[@name='p']"));
        //we can simulate keystroke using keys. select_one_of_the_option
        // n this case we are typing selenium and hit enter
        searchBox.sendKeys("Selenium"+ Keys.ENTER);

        String expectedTittleSrtWith="Selenium";
        String actualTitle= driver.getTitle();

        // quit the browser

        //assert the tittle startsWIth selenium'
        assertTrue(actualTitle.startsWith("Selenium"));






    }

}
