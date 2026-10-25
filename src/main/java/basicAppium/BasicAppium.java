package basicAppium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BasicAppium {

    private AppiumDriver driver;

    @BeforeEach
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("appium:deviceName", "Pixel_3a_API_30_x86");
        capabilities.setCapability("appium:udid", "emulator-5554");
        capabilities.setCapability("appium:platformVersion", "11.0");
        capabilities.setCapability("appium:appPackage", "com.android.contacts");
        capabilities.setCapability("appium:appActivity", "com.android.contacts.activities.PeopleActivity");
        driver = new AndroidDriver(new URL(" http://127.0.0.1:4723/"),capabilities);
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
    }

    @Test
    public void test() throws InterruptedException {
        String nameContact = "Ka";
        String lastName = "fa";
        String name = (nameContact +" " +lastName);
        String numberContact = "+591 63567962";

        //create a new contact
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Create new contact\"]")).click();

        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.contacts:id/left_button']")).click();

        driver.findElement(By.xpath("//android.widget.EditText[@text='First name']")).sendKeys(nameContact);

        driver.findElement(By.xpath("//android.widget.EditText[@text='Last name']")).sendKeys(lastName);

        driver.findElement(By.xpath("//android.widget.EditText[@text='Phone']")).sendKeys("+59179713277");

        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.contacts:id/editor_menu_save_button\"]")).click();


        WebElement elementoContacto = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\""+name+"\"]"));
        String textoContacto = elementoContacto.getAttribute("content-desc");

        Assertions.assertEquals(name,textoContacto);










    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}