package org.shishigami.common.snippets.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.shishigami.common.snippets.beans.Person;

public class Serializer {

	public void savePerson(Person person) {
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;

		try {
			fileOutputStream = new FileOutputStream("C:\\person.txt");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(person);
		} catch (Exception e) {
			// who cares?
		} finally {
			try {
				objectOutputStream.close();
				fileOutputStream.close();
			} catch (Exception e) {
				// shit just got REAL
			}
		}

	}

	public Person readPerson(String path) {
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		Person retval = null;

		try {
			fileInputStream = new FileInputStream(path);
			objectInputStream = new ObjectInputStream(fileInputStream);

			retval = (Person) objectInputStream.readObject();
		} catch (Exception e) {
			// who cares?
		} finally {
			try {
				objectInputStream.close();
				fileInputStream.close();
			} catch (Exception e) {
				// shit just got REAL
			}
		}

		return retval;
	}

}
