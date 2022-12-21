package JavaClass.Class23;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Opening the Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing window at Chrome");
    }

    @Override
    public void findElement() {
        System.out.println("Finding element at Chrome");
    }
}
class FirefoxDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Opening the Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Firefox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing window at Firefox");
    }

    @Override
    public void findElement() {
        System.out.println("Finding element at Firefox");
    }
}

