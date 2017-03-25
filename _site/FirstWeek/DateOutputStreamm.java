package FirstWeek;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DateOutputStreamm {
	public static void main(String[] args) throws IOException {
		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("D:\\text.text")));
		out.write(1);
		out.writeUTF("String");
		out.writeDouble(11.11);
		out.close();
		
		DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\text.text")));
		System.out.println(in.read());
		System.out.print(in.readUTF());
		System.out.print(in.readDouble());
	}

}
