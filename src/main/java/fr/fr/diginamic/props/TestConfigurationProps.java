package fr.fr.diginamic.props;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class TestConfigurationProps {

public static void main (String[] args) {

	
		// Classe pour charger un fichier propertise ( il y a 2 méthodes)
		ResourceBundle config = ResourceBundle.getBundle("Application");
		
		//Afficher la valeur du 1er élément
		String nomBase = config.getString("database.nom");
		System.out.println(nomBase);
		
		
		//boucle pour afficher les différentes clé valeur
		Enumeration <String> enumeration = config.getKeys();
		while (enumeration.hasMoreElements()) {
			String key = enumeration.nextElement();
			System.out.println(key + " : " + config.getString(key));
		
			}
		
	}

}

