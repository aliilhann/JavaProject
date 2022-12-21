package JavaClass.Class21;

public class Browser {
    void openBrowser() {
        System.out.println("Opening a Browser");
    }
    void navigate() {
        System.out.println("opening the url");
    }
    void test() {
        System.out.println("Testing the webpage");
    }
    void close() {
        System.out.println("closing the browser");
    }
}
class Chrome extends Browser{
    void openBrowser() {
        System.out.println("opening the browser in less than 1 sec");

    }

}
class Firefox {
    void openBrowser() {
        System.out.println("opening the browser takes a minute");
    }
}
class BrowserTester {
    public static void main(String[] args) {
        Chrome chrome=new Chrome();
        chrome.openBrowser();
        chrome.close();
    }
}