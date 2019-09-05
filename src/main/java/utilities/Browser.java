package utilities;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Browser extends AbstractCommon {

    public WebDriver driver;
    private final int waitTime = 5;

    public Browser() {
        setLogger();
        setDriver();
    }

    public WebDriver setDriver() {
        logger.info("-------------------------------------------------------------------------------------------");
        logger.info("Opening the Chrome browser");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
        return driver;
    }

    public void click(final WebElement element) {
        try{
            logger.info("Clicking on element " + element);
            element.click();
        } catch(Exception e) {
            failTest();
            logger.error("Unable to click on the element " + element);
        }
    }

    public int getNumberOfElementsByXpath(final String xpath) {
        final List<WebElement> elements = driver.findElements(By.xpath(xpath));
        return elements.size();
    }

    public String getText(final WebElement element) {
        return element.getText();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void openURL(final String url) {
        logger.info("Opening URL: " + url);
        driver.get(url);
    }

    @After
    public void quit() {
        logger.info("Closing the browser");
        driver.close();
        driver.quit();
    }

    public void scrollIntoView(final WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void type(final WebElement element, final String text) {
        try {
            logger.info("Typing '" + text + "' into the element " + element);
            element.sendKeys(text);
        } catch(Exception e) {
            failTest();
            logger.error("Unable to type '" + text + "' into element " + element);
        }
    }
}
