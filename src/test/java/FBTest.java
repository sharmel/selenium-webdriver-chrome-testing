import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

import java.util.List;

public class FBTest {

    @Test
    public void login() {
        String pathToChromeDriver = "../chromedriver";

        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");

        FBTestRep fb = new FBTestRep(driver);
        fb.Email().sendKeys("shamsideenquadri@yahoo.com");
        fb.Password().sendKeys("iloveAishamybaby");

        // Select from dropdown by using index

        WebElement month_dropdown3=driver.findElement(By.id("month"));

        Select month3=new Select(month_dropdown3);

        month3.selectByIndex(4);

        // Select from dropdown by using attribute value

        WebElement month_dropdown2=driver.findElement(By.id("month"));

        Select month2=new Select(month_dropdown2);

        month2.selectByValue("5");

        // Select from dropdown by visible text
        WebElement month_dropdown1=driver.findElement(By.id("month"));

        Select month1=new Select(month_dropdown1);

        month1.selectByVisibleText("Aug");

        // Get selected dropdown option

        WebElement month_dropdown=driver.findElement(By.id("month"));

        Select month=new Select(month_dropdown);

        WebElement first_value=month.getFirstSelectedOption();

        String value=first_value.getText();

        // Get all options from dropdown

        WebElement months_dropdown=driver.findElement(By.id("month"));

        Select months=new Select(months_dropdown);

        List<WebElement> dropdown=months.getOptions();

        for(int i=0;i<dropdown.size();i++){

            String drop_down_values=dropdown.get(i).getText();

            System.out.println("dropdown values are "+drop_down_values);

        }


        fb.Login().click();
    }
}
