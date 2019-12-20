import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBTestRep {

    WebDriver driver;
    By username = By.id("email");
    By password = By.name("pass");
    By login = By.xpath("//input[@type='submit']");


    public FBTestRep (WebDriver driver) {
        this.driver= driver;
    }


    public WebElement Email() {
        return driver.findElement(username);
    }

    public WebElement Password() {
        return driver.findElement(password);
    }

    public WebElement Login() {
        return driver.findElement(login);
    }
}
