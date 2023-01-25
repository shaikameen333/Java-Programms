package String;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class file {
public static void main(String[] args) throws IOException {
	File f1=new File("Ameen.txt");
	if(!f1.exists()) {
		f1.createNewFile();
		System.out.println("file created");
	}
	else {
		System.out.println("file not created");
	}
	FileOutputStream fos=new FileOutputStream(f1);
	String s1="abcduzn";
	fos.write(s1.getBytes());
	
	
}
}
