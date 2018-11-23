package gmail.com.jbehave;

import gmail.com.steps.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DifinitionLoginSteps {

	@Steps
	EndUserSteps endUser;


	@Given("the user '$username' with password '$password' is on main github page")
	public void givenTheUserIsOnTheGithubMainPage(String username, String password) {
		endUser.is_the_github_page(username, password);
	}


	@When("the user logged in to email")
	public void whenTheUserOpensPersonalRepositories() {
		endUser.opens_personal_repositories();
	}

	@Then("amount of emails should be printed")
	public void thenAmountOfRepositorieShouldBePrinted() {
		endUser.amount_of_repositories();
	}
}
