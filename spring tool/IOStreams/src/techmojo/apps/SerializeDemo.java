package techmojo.apps;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import techmojo.beans.Student;

public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(101, "ssd", "iiit@123", 54, 56, 89);
		System.out.println("Serializing started");
		try {
			FileOutputStream fos = new FileOutputStream("student.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			System.out.println("----------"); 
			oos.writeObject(s);
			oos.close();
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}