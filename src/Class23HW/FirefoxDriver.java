package Class23HW;

class FirefoxDriver implements IWebDriver {
    String name;

    FirefoxDriver(String name) {
        this.name = name;
    }

    public void openBrowser(){

        System.out.println("Open "+ name);
    };
    public void closeBrowser(){

        System.out.println("Close "+ name);
    };
    public void maximizeWindow(){

        System.out.println("Maximize the " +name +" window");
    };
    public void findElement(){

        System.out.println("Find element on the "+name+" page");
    };

}

