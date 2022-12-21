package Repls;

public class WebDriverTest {
    public static void main(String[] args) {

        RemoteWebDriver []remoteWebDrivers={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
        for(RemoteWebDriver drivers:remoteWebDrivers) {
            drivers.open();
            drivers.close();
            drivers.getTitle();
            drivers.navigate();
            drivers.getScreenshot();
        }

    }
}




