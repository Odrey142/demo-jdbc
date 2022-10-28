import java.lang.module.Configuration;
import java.util.Iterator;

import org.apache.commons.configuration2.builder.fluent.Configurations;

public class TestConfigurationXML {
	
public static void main (String[] args) {

		//Charger le fichier XML 
		Configurations configs = new Configurations();
		Configurations configXML = Configurations.xml("database.xml");
		
		//Afficher les valeurs des paramètres du fichier
		String nomBase = configXML.getString("database[@nom]");
		String host = configs.getString("database.host");
		
		
		//Boucle pour afficher les différentes clé valeur
		Iterator<String >iterkeys = configXML.getKeys();
		while (iterkeys.hasNext()) { // tant qu'on n'est pas au bout cela retourne true
			String key = iterkeys.next(); // Je retourne l'élément courant et j'avance d'un cran
			String valeur = configXML.getString(key);

			System.out.println(key + " : " + valeur);
	}

}
