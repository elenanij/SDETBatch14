package Class23HW;

public class ChromeDriver implements IWebDriver {
    String name;

    ChromeDriver(String name) {
        this.name = name;
    }

      public void openBrowser(){

          System.out.println("Open "+ name);
      };
      public void closeBrowser(){

          System.out.println("Close "+name);
      };
      public void maximizeWindow(){

          System.out.println("Maximize the "+name+" window");
      };
      public void findElement(){

          System.out.println("Find element on the "+name+" page");
      };

}

