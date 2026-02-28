package StepDef;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Helper.Config;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class CommunStepDef {

	
	@After
	public void tearDown(Scenario sc) {
		//System.out.println("test");
		if (sc.isFailed()) {		
		File ScreenShotSource =  ((TakesScreenshot) Config.driver)
            .getScreenshotAs(OutputType.FILE);
		
		String x = sc.getName().replace("","_");
		File screenShotDestination  = new File ("C:\\Users\\hp\\eclipse-workspace\\Mabrouk\\"+x+"png");
			try {
				FileUtils.copyFile(ScreenShotSource, screenShotDestination);
			}catch (Exception e) {
				// TODO: handle exception
			}
   
		}
	}
}
