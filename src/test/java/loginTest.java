import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class loginTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        String pathDriver = "C:\\Users\\Usuario UTP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",pathDriver);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    public void testLogin() throws InterruptedException {
        // Thread.sleep(2000);
        driver.get("https://www.saucedemo.com/");

        WebElement username= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div/form/div[1]/input"));
        username.sendKeys("standard_user");

        WebElement password= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div/form/div[2]/input"));
        password.sendKeys("secret_sauce");

        WebElement button_login= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div/form/input"));
        button_login.submit();
        Thread.sleep(20000);

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
