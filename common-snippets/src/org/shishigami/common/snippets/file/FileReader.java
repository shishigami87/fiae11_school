package org.shishigami.common.snippets.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReader {

	public void printFileContent() throws IOException {
		File file = new File("resources/test.txt");
		InputStream inputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
	}

}
