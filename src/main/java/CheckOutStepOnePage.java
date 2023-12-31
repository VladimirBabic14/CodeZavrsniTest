import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStepOnePage extends BasePage
{
    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement postalCode;

    @FindBy(id = "continue")
    WebElement buttonContinue;

    @FindBy(id = "finish")
    WebElement finish;

    @FindBy(className = "complete-header")
    WebElement getText;


    @FindBy(className = "summary_subtotal_label")
    WebElement priceTotal;

    @FindBy(css = ".summary_info_label.summary_total_label")
    WebElement total;

    @FindBy(id = "continue-shopping")
    WebElement ButtonContinue;

    public CheckOutStepOnePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setForm(String name, String last, String zip) {
        firstName.sendKeys(name);
        lastName.sendKeys(last);
        postalCode.sendKeys(zip);
        buttonContinue.click();
    }

    public void clickFinish() {
        finish.click();
    }

    public String getMessage() {
        return getText.getText();
    }

    public String getTotal()
    {
        return total.getText();
    }
    public String getItemTotal()
    {
        return priceTotal.getText();
    }

    public void setButtonContinue()
    {
        ButtonContinue.click();
    }
}
