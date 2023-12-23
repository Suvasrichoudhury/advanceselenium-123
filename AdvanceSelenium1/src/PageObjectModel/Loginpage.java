package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	@FindBy(linkText="Log in")
	private WebElement login;
	@FindBy(id="Email")
	private WebElement emailid;
	@FindBy(id="Password")
	private WebElement Password;
	@FindBy(css="[value='Log in']")
	private WebElement loginbutton;
	//use getter
	public WebElement getLogin() {
		return login;
	}
	public WebElement getEmailid() {
		return emailid;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
}
