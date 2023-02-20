public interface Webdriver {
    void open();
    void close();
    String getTitle();
}
class RemoteWeb implements Webdriver{
    @Override
    public void open() {
        System.out.println("opening the Web Driver");
    }

    @Override
    public String getTitle() {
        return "getting the title";
    }
    void navigate(){
        System.out.println("Navigating the Web Driver");
    }

    @Override
    public void close() {
        System.out.println("closing the WebDriver");
    }
}
class TakesScreenshot implements Webdriver{
    @Override
    public void open() {
        System.out.println("opening the Web Driver");
    }

    @Override
    public String getTitle() {
        return "getting the title";}

    @Override
    public void close() {
        System.out.println("closing the WebDriver");
    }
    void getScreenshot(){
        System.out.println("it can took screen shot");
    }

}
class ChromeDriver extends RemoteWeb{

}
class FirefoxDriver extends RemoteWeb{

}
class SafariDriver extends RemoteWeb{

}