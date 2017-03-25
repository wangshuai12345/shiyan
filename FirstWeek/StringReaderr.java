package FirstWeek;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderr {

	public static void main(String[] args) throws IOException {
		StringReader sr = new StringReader(BufferedInputFile.read("C:\\BufferedInputFile.java"));
		int s ;
		while((s = sr.read())!= -1)
		System.out.print(s+"\n");
		
		
	}

}
