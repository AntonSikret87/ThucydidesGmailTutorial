package gmail.com.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {

	@FindBy(xpath = "//img[@alt='@arturdvorak']")
	private WebElement headerDropdown;

	@FindBy(linkText = "Your profile")
	private WebElement yourProfileInHeaderDropdown;

	@FindBy(xpath = "//a[contains(@href, '/arturdvorak?tab=repositories')]")
	private WebElement repositoriesTab;

	@FindBy(linkText = "Artur_Dvorak")
	private WebElement repositoriesLink;

	public void goToYourProfile() {
		headerDropdown.click();
		yourProfileInHeaderDropdown.click();
	}

	public void printAmountOfRepositories() {
		int rowCount = getDriver().findElements(By.xpath("//a[contains(@itemprop,'name codeRepository')]")).size();
		System.out.println("Total number of repositories: "+ rowCount);
	}

	public void goToYourRepositories() {
		repositoriesTab.click();
	}
}
