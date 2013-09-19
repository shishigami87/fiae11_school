package org.shishigami.common.snippets.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.shishigami.common.snippets.beans.Person;

public class PropertiesReader {

	public Person createPersonFromProperties() throws IOException {
		File propertiesFile = new File("test.properties");
		InputStream inputStream = new FileInputStream(propertiesFile);

		Properties properties = new Properties();
		properties.load(inputStream);
		
		Person person = new Person();
		person.setFirstName(properties.getProperty("firstName"));
		person.setLastName(properties.getProperty("lastName"));
		
		return person;
	}
	
	public Person createModifiedPersonFromProperties() throws IOException {
		File propertiesFile = new File("test.properties");
		InputStream inputStream = new FileInputStream(propertiesFile);

		Properties properties = new Properties();
		properties.load(inputStream);
		
		properties.setProperty("lastName", "modifiedLastName");
		
		Person person = new Person();
		person.setFirstName(properties.getProperty("firstName"));
		person.setLastName(properties.getProperty("lastName"));
		
		return person;
	}

}
