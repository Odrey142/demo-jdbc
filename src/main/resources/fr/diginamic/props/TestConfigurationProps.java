
public class TestConfigurationProps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ResourceBundle config = ResourceBundle.getBundle("database");
		String driverName = config.getString("database.driver");
		
		Configurations configs = new Configurations(); 
		Configuration config = configs.properties("config.properties");
		String nomBase = config.getString("database.nom");
		
		
	}

}
