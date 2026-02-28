package Helper;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Utils {

	public static String getProperty(String property) throws Exception {
		// en cas de besoin d'une donnee du fichier propreties, on fait appel a cette methode 
		InputStream input = new FileInputStream("src\\test\\resources\\Propreties\\properties");
		
		//appel a la nouvelle classe Properties
		Properties properties = new Properties();
		properties.load(input);// lecture du fichier
		
		return(properties.getProperty(property)); //retour du resultat 
		
}
}