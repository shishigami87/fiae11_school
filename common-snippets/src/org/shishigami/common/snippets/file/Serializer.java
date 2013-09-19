package org.shishigami.common.snippets.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.shishigami.common.snippets.beans.Person;

public class Serializer {
	
	public void savePerson(Person person) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\person.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(person);
		
		objectOutputStream.close();
		fileOutputStream.close();
	}
	
	public Person readPerson(String path) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(path);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		Person retval = null;
		
		try {
			retval = (Person) objectInputStream.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		objectInputStream.close();
		fileInputStream.close();
		
		return retval;
	}

}
