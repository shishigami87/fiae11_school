package org.shishigami.common.snippets;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.shishigami.common.snippets.file.PropertiesReader;
import org.shishigami.common.snippets.file.FileReader;
import org.shishigami.common.snippets.file.RecursiveSearch;

public class Start {
	
	public static void main(String[] args) {
		try {
			System.out.println("[INFO] Testing PropertiesReader\n");
			PropertiesReader propertiesReader = new PropertiesReader();
			System.out.println(propertiesReader.createPersonFromProperties());
			System.out.println(propertiesReader.createModifiedPersonFromProperties());
			
			System.out.println("\n[INFO] Testing FileReader\n");
			FileReader readFile = new FileReader();
			readFile.printFileContent();
			
			System.out.println("\n[INFO] Testing RecursiveSearch\n");
			RecursiveSearch recursiveSearch = new RecursiveSearch();
			List<File> results = recursiveSearch.findFiles(new File("."), "1.txt");
			System.out.println(results.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
