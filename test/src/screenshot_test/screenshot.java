package screenshot_test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class screenshot {
@Test
public void test() throws IOException
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.google.com");
	EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
    File src=edriver.getScreenshotAs(OutputType.FILE);
    File tar=new File("./Screenshot/testing.jpeg");
    FileUtils.copyFile(src, tar);
    		
    		
    
}

	

}
