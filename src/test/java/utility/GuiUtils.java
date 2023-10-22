package utility;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class GuiUtils {

    WebDriver driver;
    public GuiUtils(WebDriver driver)
    {
        this.driver=driver;
    }

    public void applySoftAssertion()
    {
        SoftAssert softAssert =new SoftAssert();
        String Message="";
        softAssert.assertEquals("", "",Message);
        System.out.println(Message);
    }
}
