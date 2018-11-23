package gmail.com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://gmail.com")
public class StartPage extends PageObject {
	@FindBy(linkText = "Sign in")
	private WebElement loginButton;

	public void goToLoginPage() {
		getDriver().manage().window().maximize();
		loginButton.click();
	}
}
