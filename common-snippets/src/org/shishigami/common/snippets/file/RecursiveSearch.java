package org.shishigami.common.snippets.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RecursiveSearch {

	public List<File> findFiles(File path, String fileName) {
		List<File> results = new ArrayList<File>();
		File[] files = path.listFiles();
		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				results.addAll(findFiles(files[i], fileName));
			} else if (files[i].isFile()) {
				if (files[i].getName().equals(fileName)) {
					results.add(files[i]);
				}
			}
		}
		return results;
	}

}
