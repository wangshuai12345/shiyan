package FirstWeek;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {
	
	public static String read(String file) throws IOException{
		BufferedInputStream br = new BufferedInputStream(new FileInputStream(file) );
		int s;
		StringBuilder sb = new StringBuilder();
		while((s = br.read()) != -1)
			sb.append((char)s);
		br.close();
		return sb.toString();
		
	}
	
	public static void main(String args[]) throws IOException{
		System.out.print(read("C:\\BufferedInputFile.java"));
	}

}
