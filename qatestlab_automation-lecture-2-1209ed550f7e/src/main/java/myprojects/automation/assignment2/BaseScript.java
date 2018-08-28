package myprojects.automation.assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Base script functionality, can be used for all Selenium scripts.
 */
public abstract class BaseScript {

    /**
     *
     * @return New instance of {@link WebDriver} object.
     */
    static {
        System.setProperty("webdriver.chrome.driver", getChromeDriverName());
    }

    public static WebDriver getDriver() {
        return new ChromeDriver();
    }

        private static String getChromeDriverName() {
            String osName = System.getProperty("os.name").toLowerCase();
            String result;
            if (osName.contains("mac")) {
                result = "/chromedriver-mac";
            } else if (osName.contains("linux")) {
                result = "/chromedriver-linux";
            } else {
                result = "/chromedriver.exe";
            }
            return result;
        }
     //   throw new UnsupportedOperationException("Method doesn't return WebDriver instance");
    }

