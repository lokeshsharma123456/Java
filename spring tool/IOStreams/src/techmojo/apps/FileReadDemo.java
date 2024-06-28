package techmojo.apps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("f1.txt");
			int nbytes = fin.available();
			byte[] arr = new byte[nbytes];
			fin.read(arr);
			String content  = new String(arr);
			System.out.println("file ontent");;
			System.out.println(content);
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
