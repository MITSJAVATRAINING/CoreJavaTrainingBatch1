package exceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourcesExample {

	public static void main(String args[]){
		FileInputStream fileInputStream = null;
		 try {
			 fileInputStream = new FileInputStream("d:/abc.txt");
			 fileInputStream.read();
		 } catch(IOException exception) {
			 exception.printStackTrace();
		 } finally {
			 if (fileInputStream != null ) {
				 try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		 }
	}
}
