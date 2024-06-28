package techmojo.apps;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteDemo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "101,Lokesh Sharma,lokesh.sharma@techmojo.in,93,69,98";
		String name1 = "102,Utkarsh Pathak,Utkarsh.pathak@techmojo.in,23,9,9";
		System.out.println("wel to file io");
		
			try {
				FileOutputStream fos = new FileOutputStream("StudentRecord.txt");
				fos.write(name.getBytes());
				fos.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
	}

}
