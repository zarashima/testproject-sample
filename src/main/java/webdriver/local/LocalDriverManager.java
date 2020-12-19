package webdriver.local;

import helpers.StringConstants;
import io.testproject.sdk.drivers.TestProjectCapabilityType;
import io.testproject.sdk.drivers.web.ChromeDriver;
import io.testproject.sdk.drivers.web.EdgeDriver;
import io.testproject.sdk.drivers.web.FirefoxDriver;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
import io.testproject.sdk.internal.exceptions.AgentConnectException;
import io.testproject.sdk.internal.exceptions.InvalidTokenException;
import io.testproject.sdk.internal.exceptions.ObsoleteVersionException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;

public class LocalDriverManager {
	public WebDriver createInstance(String runWhere, String browser) throws InvalidTokenException, AgentConnectException, ObsoleteVersionException, IOException {
		WebDriver driver = null;
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		if ("local".equals(runWhere)) {
			switch (browser) {
				case "chrome":
					driver = new ChromeDriver();
					break;
				case "firefox":
					driver = new FirefoxDriver();
					break;
				default:
					throw new IllegalArgumentException("Not supported browser");
			}
		} else {
			throw new IllegalArgumentException("Not supported browser");
		}
		return driver;
	}
}
