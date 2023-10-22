package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//*[contains(text(), \'GREEN\')]")
    private WebElement pageLogo;
@FindBy(xpath="//*[@placeholder='Search for Vegetables and Fruits']")
    private WebElement searchInputBox;
@FindBy(linkText = "Top Deals")
    private WebElement clickTopDeals;
@FindBy(xpath = "//button[@type='submit']")
    private WebElement clickSearchBtn;
@FindBy (xpath = "//*[contains(text(), 'ADD TO CART')]")
    private WebElement addToCartBtn;



public void validateLogo()
{
    System.out.println(pageLogo.isDisplayed());
}
public void searchTheProduct(String s)
{

searchInputBox.sendKeys(s);
}
public void clickOnSearchBtn()
{
    //clickSearchBtn.click();
}
public void clickOnTopDealsLink()
{
    clickTopDeals.click();
}

public void addProductInCart()
{
addToCartBtn.click();
}
}