package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class ChemisesBlouses {

	@FindBy (xpath="/html/body/div[6]/div[3]/div[4]/main/div/div[4]/div/ul/li/div/div[2]/div[3]/div[1]/h6/a")
	List <WebElement>menus;
	
	@FindBy (xpath="/html/body/div[6]/div[3]/div[4]/main/div/div[4]/div/ul/li[10]/div/div[2]/div[3]/div[2]/div/ul/li[2]")
	
	WebElement veriPdt;
	
	
	public ChemisesBlouses () {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void clickOnProduct(String pdtTitle){
		Config.attente(10);
		try {
			Actions actions= new Actions (Config.driver);// pour cliquer en dehors de la fenetre 
			actions.moveByOffset(10, 10).click().perform();
		for(WebElement menu:menus ) {
			if(menu.getText().contains(pdtTitle)) {
				((JavascriptExecutor)Config.driver).executeScript("arguments[0].scrollIntoView(true);","menu");
				Actions act=new Actions (Config.driver);
				act.moveToElement(menu).perform();
				menu.click();
			}
		}
	}catch (Exception e) {
		// TODO: handle exception
	}
	
	}
	
	
	public void verifpdt (String verifproduct) {
		Config.attente(10);
		String actualtext= veriPdt.getText();
		Assert.assertTrue(verifproduct.toUpperCase().contains(actualtext.toUpperCase()));
	}
}
