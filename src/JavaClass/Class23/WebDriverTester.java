package JavaClass.Class23;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] webDrivers={new ChromeDriver(), new FirefoxDriver()};
        for(WebDriver webDriver:webDrivers) {
            webDriver.openBrowser();
            webDriver.closeBrowser();
            webDriver.maximizeWindow();
            webDriver.findElement();

        }
    }
}
