package framework.utils;

import framework.BrowserFactory;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class CapabilityGenerator {
    public static ChromeOptions getChromeCapability() {
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_settings.popups", 0);
        prefs.put("profile.default_content_setting_values.notifications", 1);
        prefs.put("safebrowsing.enabled", "true");
        prefs.put("download.default_directory", BrowserFactory.getDriverPath());
        cap.setCapability("prefs", prefs);
        ChromeOptions options = new ChromeOptions();
        return options.merge(cap);
    }
}
