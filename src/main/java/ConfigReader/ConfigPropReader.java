package ConfigReader;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigPropReader {
	
	private Properties prop;
	private FileInputStream ip;
	
	public Properties initLangProp(String language) {
		
		System.out.println("language is ->" + language);
		
		prop = new Properties();
		try {
		switch(language.toLowerCase()) {
		
		case "english":
			ip = new FileInputStream("./src/main/resources/lang.english.properties");
			break;
			
				
			case "french":
				ip = new FileInputStream("./src/main/resources/lang.french.properties");
				
					break;
				case "spanish":
					ip = new FileInputStream("./src/main/resources/lang.spanish.properties");
					break;
					default:
						System.out.println("language not found...." + language);
						break;
						}
		prop.load(ip);
		}
		catch(Exception e) {
			
			System.out.println("please try with different... " + language);
			
		}
		return prop;
		}
		
		
		
		
	

}
