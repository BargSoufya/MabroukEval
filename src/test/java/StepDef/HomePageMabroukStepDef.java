package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.HomePageMabrouk;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageMabroukStepDef {
	@Given("l utilisateur  est sur la page d acceuil")
	public void l_utilisateur_est_sur_la_page_d_acceuil() throws Exception {
		Config.driver=new ChromeDriver ();
		Config.maximize();
		Config.driver.get(Utils.getProperty("Mabrouk_link"));
	
	}
	
	@When("l utilisateur clique sur le menu {string} et le sousmenu {string}")
	public void l_utilisateur_clique_sur_le_menu_et_le_sousmenu(String menuname, String submenuname) {
	    HomePageMabrouk hpm= new HomePageMabrouk();
	    hpm.mouseHoverOnMenu(menuname, submenuname);
	}
	@Then("l utilisateur  est redirige vers la page {string}")
	public void l_utilisateur_est_redirige_vers_la_page(String verifpage) {
		 	HomePageMabrouk hpm= new HomePageMabrouk();
		 	hpm.verifmenu(verifpage);
		}

}
