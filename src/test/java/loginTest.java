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
        String pathDriver = "change to your path of driver, remember that is a executable file";
        System.setProperty("webdriver.chrome.driver",pathDriver);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    public void testLogin() throws InterruptedException {
        // Add your steps here
        // Thread.sleep(2000);

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
