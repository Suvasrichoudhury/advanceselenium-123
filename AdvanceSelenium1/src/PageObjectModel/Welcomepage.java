package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
	Welcomepage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
@FindBy(linkText="Register")
private WebElement registerlink;
public WebElement getRegisterlink() {
	return registerlink;
}
}
