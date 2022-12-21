package JavaClass.class22;

public class WebDriver {
    public void startBrowser() {
        System.out.println("Starting thr Browser");
    }
    public void test() {
        System.out.println("Perform the testing");
    }
    public void closeBrowser() {
        System.out.println("Closing the browser");
    }
}
class FireFox extends WebDriver {
    public void startBrowser () {
        System.out.println("Starting the FireFox");
    }
    public void test () {
        System.out.println("Testing the FireFox");
    }
    public void closeBrowser () {
        System.out.println("Closing the FireFox");
    }
}
class Chrome extends WebDriver {
    public void startBrowser () {
        System.out.println("Starting the Chrome ");
    }
    public void test () {
        System.out.println("Testing the Chrome ");
    }
    public void closeBrowser () {
        System.out.println("Closing the Chrome ");
    }
}
class Safari extends WebDriver {
    public void startBrowser () {
        System.out.println("Starting the Safari  ");
    }
    public void test () {
        System.out.println("Testing the Safari  ");
    }
    public void closeBrowser () {
        System.out.println("Closing the Safari  ");
    }
}