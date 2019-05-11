package framework;

import framework.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/**
 * Realize imlicit/explicit/fluent waits
 *
 * @author Yaroslav Lazakovich
 * @version 1.0
 */
public class Waiter extends BaseEntity {
    private final static Duration DEFAULT_TIME_SECONDS = Duration.ofSeconds(15);
    private final static Duration DEFAULT_TIME_MILLISECONDS = Duration.ofMillis(10);
    private final static long DEFAULT_TIME_OUT = 15;
    private static final Duration TIME_MILLISECONDS = Duration.ofMillis(Long.parseLong(PropertyReader.getProperty("timeMilliseconds")));
    private static final Duration LONG_TIME_OUT = Duration.ofSeconds(Long.parseLong(PropertyReader.getProperty("longTimeOut")));
    private static final long TIME_OUT = Long.parseLong(PropertyReader.getProperty("shortTimeOut"));

    public static void implicitWait(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(TIME_OUT, TimeUnit.SECONDS);
    }

    public static void explicitWait(WebDriver driver, By by) {
        new WebDriverWait(driver, LONG_TIME_OUT.getSeconds()).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    private static <V> void fluentWait(Function<? super WebDriver, V> expectedConditions) {
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(LONG_TIME_OUT)
                .pollingEvery(TIME_MILLISECONDS)
                .ignoring(NoSuchElementException.class);
        if (expectedConditions != null) {
            fluentWait.until(expectedConditions);
        }
    }

    public static void waitForLoad() {
        try {
            WebDriverWait driverWait = new WebDriverWait(driver, TIME_OUT, DEFAULT_TIME_OUT);
            ExpectedCondition<Boolean> expectation;
            expectation = driverjs -> {
                JavascriptExecutor js = (JavascriptExecutor) driverjs;
                assert js != null;
                return js.executeScript("return(jQuery.active == 0)").equals("true")
                        &&
                        js.executeScript("return document.readyState").toString().equals("complete");
            };
            driverWait.until(expectation);
        } catch (WebDriverException ignored) {
            logger.error("loc.err.wd.ex");
        }
    }


    public static void elementToBeClickable(By by) {
        fluentWait(ExpectedConditions.elementToBeClickable(by));
    }

    public static void invisibilityOfElementLocated(By by) {
        fluentWait(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public static void presenceOfElementLocated(By by) {
        fluentWait(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static void visibilityOfElementLocated(By by) {
        fluentWait(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
