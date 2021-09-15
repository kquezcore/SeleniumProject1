package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {

        // set up chrome driver
        WebDriverManager.chromedriver().setup();

        // create chromeDriver object
        WebDriver driver = new ChromeDriver();

        // navigate to https://amazon.com
        driver.get("https://amazon.com");

        /* navigate using
                -get("url)
                - navigate ().to("url)
                - navigate ().back("url)
                - navigate ().forward("url)
                - navigate ().refresh("url)

        */

            // - navigate ().to("url)
        driver.navigate().to("https://google.com/");

        // - navigate ().back()
        driver.navigate().back();

        //- navigate ().forward()
        driver.navigate().forward();

        //- navigate ().refresh()
        driver.navigate().refresh();

        // closing browser
        /*
        close() method, will close cureent tab
        quit() method, will close all tabs if there's more than one

         */

        driver.quit();




    }
}
