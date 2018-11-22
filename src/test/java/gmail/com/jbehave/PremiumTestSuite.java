package gmail.com.jbehave;

import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.jbehave.ThucydidesJUnitStories;

public class PremiumTestSuite extends ThucydidesJUnitStories
{

		public PremiumTestSuite() {
			System.setProperty("webdriver.chrome.driver", "D:\\AutoMy\\Drivers\\chromedriver.exe");

			getSystemConfiguration().setIfUndefined("webdriver.driver", "chrome");
			getSystemConfiguration().setIfUndefined(ThucydidesSystemProperty.THUCYDIDES_STORE_HTML_SOURCE.getPropertyName(), "true");
			getSystemConfiguration().setIfUndefined(ThucydidesSystemProperty.THUCYDIDES_TAKE_SCREENSHOTS.getPropertyName(), "FOR_FAILURES");
		}

}
