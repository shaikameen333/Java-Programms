package String;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file2 {
public static void main(String[] args) throws IOException {
	File f1=new File("D:\\java programms//harley.txt");
	FileOutputStream fos=new FileOutputStream(f1);
	String s1="Ameen harley";
	fos.write(s1.getBytes());
}
}


