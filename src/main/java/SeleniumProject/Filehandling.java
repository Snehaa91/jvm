package SeleniumProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehandling {

	public static void main(String[] args) throws IOException {
		File fs = new File("C:\\Users\\SN262736\\eclipse-workspace\\jvm\\src\\main\\java\\Utilities\\NewFile1.txt");
		/*
		 * try { System.out.println(fs.createNewFile()); //this will check if the file
		 * is present or not and then accordingly create it
		 * System.out.println(fs.getName()); } catch (IOException e) { // this method is
		 * required to throw IOException or use try&catch block to handle it
		 * e.printStackTrace(); }
		 */
		/*
		 * System.out.println(fs.isFile()); System.out.println(fs.canExecute());
		 * System.out.println(fs.canRead()); System.out.println(fs.canWrite());
		 * System.out.println(fs.getAbsolutePath());
		 */

		/*
		 * FileWriter fw = new FileWriter(
		 * "C:\\Users\\SN262736\\eclipse-workspace\\jvm\\src\\main\\java\\Utilities\\NewFile1.txt"
		 * ); fw.write("Sneha Kushwaha"); //fw.append("wa"); fw.close();
		 */

		FileReader fs1 = new FileReader(
				"C:\\Users\\SN262736\\eclipse-workspace\\jvm\\src\\main\\java\\Utilities\\NewFile1.txt");
		Scanner reader = new Scanner(fs1);
		while (reader.hasNext()) {
			String data = reader.next();
			System.out.print(data+ " ");
		}

		System.out.println("*****************************************");

		/*
		 * FileInputStream fis = new FileInputStream(
		 * "C:\\Users\\SN262736\\eclipse-workspace\\jvm\\src\\main\\java\\Utilities\\NewFile1.txt"
		 * );
		 * 
		 * Scanner reader1 = new Scanner(fis); while(reader1.hasNext()) { String data1 =
		 * reader1.next(); System.out.println(data1); }
		 * 
		 * System.out.println("*****************************************");
		 * 
		 * System.out.println(fis.available()); System.out.println(fis.getFD());
		 * System.out.println(fis.getChannel()); System.out.println(fis.read());
		 */
	}

}
