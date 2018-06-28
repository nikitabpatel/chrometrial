import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial
{ static protected WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","src\\Browserdriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.ebay.co.uk/");


    }
}
