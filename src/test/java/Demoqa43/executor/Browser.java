package Demoqa43.executor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

   public WebDriver driver;
    public void  init(String browsertype){

        if (browsertype.equalsIgnoreCase("chrome")){

            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if (browsertype.equalsIgnoreCase("firefox")){

            WebDriverManager.firefoxdriver().setup();
            driver=new ChromeDriver();
        }

    }

    public void  navigateto(String str5){
        driver.manage().window().maximize();
        driver.get(str5);
    }


}
