package Demoqa43.pages;

import Demoqa43.executor.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Siteactions {

    WebDriver driver;
    Siteactions stact;
    Browser browser;

    public  void  setWebDriver(WebDriver driver){

        this.driver=driver;
    }

    public void  setDriverstep2(){

         browser=new Browser();
         stact=new Siteactions();
        browser.init("chrome");
        stact.setWebDriver(browser.driver);

    }
    public void  ClickButtontoseealert(){

        stact=new Siteactions();
        stact.setDriverstep2();
        WebElement element3=driver.findElement(By.id("alertButton"));
        element3.click();
        driver.switchTo().alert().accept();
    }
}
