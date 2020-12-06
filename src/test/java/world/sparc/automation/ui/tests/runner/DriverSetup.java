package world.sparc.automation.ui.tests.runner;
import org.openqa.selenium.chrome.ChromeOptions;
class DriverSetup extends Runner {
    void optionsArguments() {
        if (remote) {
            options.addArguments("--disable-gpu");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--allow-failed-policy-fetch-for-test");
            options.addArguments("--disable-browser-side-navigation");
            options.addArguments("--incognito");
            options.addArguments("--disable-notifications");
            options.addArguments("--window-size=1920,1080", "--no-sandbox", "'--disable-dev-shm-usage");
            // options.addArguments("--headless");}
        }
        else {
            options.addArguments("--disable-gpu");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--allow-failed-policy-fetch-for-test");
            options.addArguments("--disable-browser-side-navigation");
            options.addArguments("--incognito");
            options.addArguments("--disable-notifications");
            options.addArguments("--window-size=1920,1080", "--no-sandbox", "'--disable-dev-shm-usage");
        }
    }
}
