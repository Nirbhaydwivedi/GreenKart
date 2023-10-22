package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    WebDriver driver;

    public PageObjectManager(WebDriver driver)
    {
        this.driver=driver;
    }
    public HomePage getHomePageObject()
    {
        HomePage hp=new HomePage(driver);
        return hp;
    }
    public TopDeals getTopDealsObejct()
    {
        TopDeals td = new TopDeals();
        return td;
    }
}
