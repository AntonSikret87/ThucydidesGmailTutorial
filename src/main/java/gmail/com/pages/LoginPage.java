package gmail.com.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
	private WebElement login_field;
	private WebElement password;

	@FindBy(name = "commit")
	private WebElement buttonSignIn;


	public void signIn(String username, String passwordKeys) {
		login_field.sendKeys(username);
		password.sendKeys(passwordKeys);
		buttonSignIn.click();
	}
}
