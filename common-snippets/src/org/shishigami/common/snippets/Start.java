package org.shishigami.common.snippets;

import java.io.IOException;

import org.shishigami.common.snippets.file.PropertiesReader;

public class Start {
	
	public static void main(String[] args) {
		PropertiesReader propertiesReader = new PropertiesReader();
		
		try {
			System.out.println(propertiesReader.createPersonFromProperties());
			System.out.println(propertiesReader.createModifiedPersonFromProperties());
		} catch (IOException e) {
			System.out.println("File error! \n \n" + e);
		}
	}

}
