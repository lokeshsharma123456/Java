package techmojo.apps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fin = new FileInputStream("lower.txt");
			int nbytes = fin.available();
			byte[] arr = new byte[nbytes];
			fin.read(arr);
			String content  = new String(arr);
			System.out.println("file ontent");;
			System.out.println(content);
			
			//now have to write to other file
			content = content.toUpperCase();
			try {
				FileOutputStream fos = new FileOutputStream("upper.txt");
				fos.write(content.getBytes());
				fos.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
