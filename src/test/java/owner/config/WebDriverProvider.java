package owner.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {

        private final WebDriverConfig config;

        public WebDriverProvider(final WebDriverConfig config) {
            this.config = config;
        }

        @Override
        public WebDriver get() {
            if (config.getBrowser().equals(Browser.FIREFOX)) {
                return new FirefoxDriver();
            }
            return new ChromeDriver();
        }
}
