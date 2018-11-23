package gmail.com.steps;

import gmail.com.pages.LoginPage;
import gmail.com.pages.MainPage;
import gmail.com.pages.StartPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class EndUserSteps extends ScenarioSteps {

    StartPage startPage;
    LoginPage loginPage;
    MainPage mainPage;

    @Step
    public void is_the_github_page(String username, String password) {
        startPage.open();
        startPage.goToLoginPage();
        loginPage.signIn(username, password);
        mainPage.goToYourProfile();
    }

    @Step
    public void opens_personal_repositories() {
        mainPage.goToYourRepositories();
    }

    @Step
    public void amount_of_repositories() {
        mainPage.printAmountOfRepositories();
    }
}
