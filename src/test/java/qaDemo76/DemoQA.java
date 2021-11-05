package qaDemo76;

import Extentreport.Webreport;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoQA {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Webreport webreport=new Webreport();
        webreport.createreport("C:\\Users\\arkaj\\Desktop\\codestorm\\Demoqa21\\src\\test\\resources\\webresult.html");
        JavascriptExecutor js1=(JavascriptExecutor)driver;
        driver.manage().window().maximize();
        webreport.starttest("Demo QA Test");
        Thread.sleep(5000);
        driver.get("https://demoqa.com/browser-windows");
        webreport.testinfo("Navigate to website.");
        WebElement el1,le2,tp2;
        js1.executeScript("window.scrollBy(0,100)");
        webreport.testinfo("Scrolling done.");
        el1= driver.findElement(By.xpath("//span[contains(text(),'Alerts') and contains(@class,'text')]"));
        Thread.sleep(3000);
        el1.click();
        webreport.testinfo("Alert is clicked.");
        le2= driver.findElement(By.id("alertButton"));
        Thread.sleep(3000);
        le2.click();
        webreport.testinfo("Click me button clicked");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        webreport.testinfo("OK button clicked.");
        Thread.sleep(3000);
        tp2=driver.findElement(By.id("confirmButton"));
        Thread.sleep(3000);
        tp2.click();
        webreport.testinfo("Click me button clicked");
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        webreport.testinfo("Cancel button clicked.");
        Thread.sleep(5000);
        driver.close();
        webreport.endtest();
        webreport.flushresult();

    }
}
