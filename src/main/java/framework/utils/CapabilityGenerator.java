package framework.utils;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

/**
 * Allows set Capabilities for drivers
 *
 * @author Yaroslav Lazakovich
 * @version 1.0
 */
public class CapabilityGenerator {
    public static ChromeOptions getChromeCapability() {
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_settings.popups", 0);
        prefs.put("profile.default_content_setting_values.notifications", 1);
        prefs.put("safebrowsing.enabled", "true");
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability("prefs", prefs);
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        options.setExperimentalOption("prefs", prefs);
        return options.merge(cap);
    }

    public static FirefoxOptions capabilityForFirefox() {
        FirefoxProfile prof = new FirefoxProfile();
        prof.setPreference("browser.download.dir", "src/test/resources");
        prof.setPreference("browser.download.folderList", 2);
        prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/x-debian-package, application/octet-stream");
        prof.setPreference("webdriver.load.strategy", "unstable");
        prof.shouldLoadNoFocusLib();
        FirefoxOptions option = new FirefoxOptions();
        System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
        return option.setProfile(prof);

    }
}
