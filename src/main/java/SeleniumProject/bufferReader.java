package SeleniumProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;

public class bufferReader {

	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new FileReader("C:\\\\Users\\\\SN262736\\\\eclipse-workspace\\\\jvm\\\\src\\\\main\\\\java\\\\Utilities\\\\NewFile.txt"));
		//System.out.println(rd.readLine());
        //System.out.println(rd.read());
		//System.out.println(rd.lines().forEach(System.out::println)); //for java 8
		
		
		//System.out.println("****************************************s");
		String line = rd.readLine();
		while(line!=null) {
			System.out.println(line);
		}
		
		
		
	}

}
