public class WebDriverTester {
    public static void main(String[] args) {
        SafariDriver safariDriver=new SafariDriver();
        safariDriver.open();
        safariDriver.getTitle();
        safariDriver.navigate();
        safariDriver.close();

        FirefoxDriver firefoxDriver=new FirefoxDriver();
        firefoxDriver.open();
        firefoxDriver.getTitle();
        firefoxDriver.navigate();
        firefoxDriver.close();

        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.open();
        chromeDriver.getTitle();
        chromeDriver.navigate();
        chromeDriver.close();


        TakesScreenshot takesScreenshot=new TakesScreenshot();
        takesScreenshot.open();
        takesScreenshot.getTitle();
        takesScreenshot.getScreenshot();
        takesScreenshot.close();


    }
}
