package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePageMabrouk {
	
	@FindBy (xpath=" /html/body/div[6]/header/div/div/div[2]/nav/div/div[2]/div[1]/ul/li/a/span")
	               
	List <WebElement> menus;
	@FindBy(xpath="/html/body/div[6]/header/div/div/div[2]/nav/div/div[2]/div[1]/ul/li[3]/div/ul/li/a/span")
	List <WebElement> submenus;
	@FindBy (xpath= "/html/body/div[6]/div[3]/div[2]/div[2]/div/h1")
	WebElement  verifca;
	
	
	public HomePageMabrouk () {
		PageFactory.initElements(Config.driver, this);
	}
	
	
	
		public void mouseHoverOnMenu ( String menutitle, String submenutitle) {
		try {
			Actions actions= new Actions (Config.driver);// pour cliquer en dehors de la fenetre 
			actions.moveByOffset(10, 10).click().perform();
		for(WebElement menu: menus) {
			if(menu.getText().contains(menutitle)) {
				actions.moveToElement(menu).perform();
			}
			
		}
		for (WebElement submenu: submenus) {
			if(submenu.getText().contains(submenutitle)) {
				submenu.click();
			}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void verifmenu (String submenutitle) {
		Config.attente(10);
		String actualtext=verifca.getText();
		Assert.assertEquals(submenutitle, actualtext);
	}
}
