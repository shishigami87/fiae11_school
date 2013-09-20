package org.shishigami.common.snippets.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReader {

	public void printFileContent() {
		InputStream inputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		
		try {
			File file = new File("resources/test.txt");
			inputStream = new FileInputStream(file);
			inputStreamReader = new InputStreamReader(inputStream);
			bufferedReader = new BufferedReader(inputStreamReader);
			
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// who cares?
		} finally {
			try {
				bufferedReader.close();
				inputStreamReader.close();
				inputStream.close();
			} catch (Exception e) {
				// shit just got REAL
			}
		}
		
	}

}
