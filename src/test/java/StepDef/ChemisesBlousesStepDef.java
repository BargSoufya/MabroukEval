package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.ChemisesBlouses;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChemisesBlousesStepDef  {

	@Given("L utilisateur est sur la page Chemises et Blouses")
	public void l_utilisateur_est_sur_la_page_chemises_et_blouses() throws Exception {
	    Config.driver= new ChromeDriver();
	    Config.maximize();
	    Config.driver.get(Utils.getProperty("Mabrouk_ChemisesBlouses_link"));
	}
	@When("l utilisateur clique sur le produit {string}")
	public void l_utilisateur_clique_sur_le_produit(String NameProduit) {
		ChemisesBlouses CHB= new ChemisesBlouses();
		CHB.clickOnProduct(NameProduit);
	}
	@Then("l utilisateur est rediriger vers la page du {string} selectionné")
	public void l_utilisateur_est_rediriger_vers_la_page_du_selectionné(String name) {
		ChemisesBlouses CHB= new ChemisesBlouses();
		CHB.verifpdt(name);

}
	}
