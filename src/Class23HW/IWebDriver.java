package Class23HW;
/*
Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
*/
public interface IWebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class Test {

    public static void main(String[] args) {

        IWebDriver[] arr = {new ChromeDriver("Chrome"), new FirefoxDriver("Firefox")};

        for (IWebDriver driver:arr) {

            driver.openBrowser();
            driver.closeBrowser();
            driver.maximizeWindow();
            driver.findElement();
            System.out.println();

        }
    }
}

