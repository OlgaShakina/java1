import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.Duration;

public class MtsBlockTitleTest {
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/olgabuinova/documents/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://mts.by");
    }

    @Test
    public void checkLink() {
        WebElement moreInfoLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/a")));
        assertTrue(moreInfoLink.isDisplayed(), "Ссылка 'Подробнее о сервисе' не найдена");

        moreInfoLink.click();

        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        wait.until(ExpectedConditions.urlToBe(expectedUrl));

        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl, "Ссылка ведет на неправильную страницу");
    }

    @Test
    public void checkPhoneAndButton() {
        WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='connection-phone']")));
        phoneInput.sendKeys("298765437");

        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Продолжить')]")));
        assertTrue(continueButton.isEnabled(), "Кнопка 'Продолжить' не активна");
        continueButton.click();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


