
public class TestConfigurationXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configurations configs = new Configurations();
		Configuration config = configs.properties("config.xml");
		String nomBase = config.getString("database[@nom]");
		String host = config.getString("database.host");

	}

}
