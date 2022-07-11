package com.Checkedin.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
	Properties pro;
	//constructor
	public Readconfig() {
		File src =new File("./Configurations/config.properties");
		try {
			FileInputStream fis= new FileInputStream(src);
			pro =new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is "+ e.getMessage());
		}
	}
	public String getApllicationURL() {
		String url=pro.getProperty("baseURL");
		return url;
		
	}
	
	public String getUsername()
	{
		String username=pro.getProperty("username");
		return username;
		
	}
	public String getpassword()
	{
		String password=pro.getProperty("password");
		return password;
		
	}
	
public String getchromepath()
{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
}

public String getfirefoxpath()
{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
}
/*public String getSitename() 
{
	String SiteName=pro.getProperty("SiteName");
	return SiteName;
}

public String getAddress()
{
	String Address=pro.getProperty("Address");
	return Address;
}*/
}
