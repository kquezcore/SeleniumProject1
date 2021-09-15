package com.cybertek.Day04__common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LocatingDropDownList {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dropdown");

        // TODO:  Identify first dropDown
        WebElement yearDropdownElem = driver.findElement(By.id("year"));


        // TODO: Wrap it up using select class so we can use easy methods
        Select yearSelectObj = new Select(yearDropdownElem);

        // TODO: select items in 3 different ways

        // SELECT 3RD OPT
        yearSelectObj.selectByIndex(2);
        // select item with value attribute 2019
        yearSelectObj.selectByValue("2000");
        // Select item with visible text
        yearSelectObj.selectByVisibleText("1990");

     //   yearSelectObj.selectByVisibleText("BLA BLA");


        // TODO:  Identify the month  dropDown
        WebElement monthDropdownElem = driver.findElement(By.id("month"));


        // TODO: Wrap it up using select class so we can use easy methods
        Select monthSelectObj = new Select(monthDropdownElem);

        // TODO: select items in 3 different ways

        monthSelectObj.selectByIndex(4);
        //
        monthSelectObj.selectByValue("7");
        // Select item with visible text
        monthSelectObj.selectByVisibleText("December");


        // CLOSE THE BROWSER
        driver.quit();


    }




}
