package techmojo.apps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import techmojo.beans.Student;

public class StudentOperationWithoutError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("StudentRecord.txt");
			try {
				int nbytes = fin.available();
				byte[] arr = new byte[nbytes];
				fin.read(arr);
				String content = new String(arr);
				//split to diferent lines
				String[] records = content.split("\n");
				
				FileOutputStream fout = new FileOutputStream("UpdateStudent.txt");
				for(String s: records)
				{
					String[] parts = s.split(",");
					int id = Integer.parseInt(parts[0].trim()); // Assuming id is always the first field
			        String name = parts[1].trim(); // Assuming name is always the second field
			        String email = parts[2].trim(); // Assuming email is always the third field
			        
			        // Parsing and adding marks
			        int mark1 = Integer.parseInt(parts[3].trim());
			        int mark2 = Integer.parseInt(parts[4].trim());
			        int mark3 = Integer.parseInt(parts[5].trim());
//			        
			        Student s1 = new Student(id, name, email, mark1, mark2, mark3);
			        fout.write(s1.toCSV().getBytes());
			        
			        
				}
				fin.close();
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
