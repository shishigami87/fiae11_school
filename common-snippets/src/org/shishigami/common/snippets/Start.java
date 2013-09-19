package org.shishigami.common.snippets;

import java.io.IOException;

import org.shishigami.common.snippets.file.PropertiesReader;
import org.shishigami.common.snippets.file.ReadFile;

public class Start {
	
	public static void main(String[] args) {
		try {
			System.out.println("[INFO] Testing PropertiesReader\n");
			PropertiesReader propertiesReader = new PropertiesReader();
			System.out.println(propertiesReader.createPersonFromProperties());
			System.out.println(propertiesReader.createModifiedPersonFromProperties());
			
			System.out.println("\n[INFO] Testing FileReader\n");
			ReadFile readFile = new ReadFile();
			readFile.printFileContent();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
