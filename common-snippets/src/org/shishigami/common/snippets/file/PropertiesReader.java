package org.shishigami.common.snippets.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.shishigami.common.snippets.beans.Person;

public class PropertiesReader {

	public Person createPersonFromProperties() {
		InputStream inputStream = null;
		Person person = null;

		try {
			File propertiesFile = new File("resources/test.properties");
			inputStream = new FileInputStream(propertiesFile);

			Properties properties = new Properties();
			properties.load(inputStream);

			person = new Person();
			person.setFirstName(properties.getProperty("firstName"));
			person.setLastName(properties.getProperty("lastName"));
		} catch (Exception e) {
			// who cares?
		} finally {
			try {
				inputStream.close();
			} catch (Exception e) {
				// shit just got REAL
			}
		}

		return person;
	}

	public Person createModifiedPersonFromProperties() {
		InputStream inputStream = null;
		Person person = null;

		try {
			File propertiesFile = new File("resources/test.properties");
			inputStream = new FileInputStream(propertiesFile);

			Properties properties = new Properties();
			properties.load(inputStream);

			properties.setProperty("lastName", "modifiedLastName");

			person = new Person();
			person.setFirstName(properties.getProperty("firstName"));
			person.setLastName(properties.getProperty("lastName"));
		} catch (Exception e) {
			// who cares?
		} finally {
			try {
				inputStream.close();
			} catch (Exception e) {
				// shit just got REAL
			}
		}

		return person;
	}

}
