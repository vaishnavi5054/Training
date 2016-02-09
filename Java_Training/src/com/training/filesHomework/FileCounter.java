package com.training.filesHomework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class FileCounter {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter path of the file to count number of lines: ");
		String source = scanner.next();
		System.out.println("Source is:" + source);
		File sourcefile = new File(source);
		int lines = 0;
		int count = 0;
		String line;
		BufferedReader bufferedreader = new BufferedReader(new FileReader(sourcefile));
		while ((line = bufferedreader.readLine()) != null) {
			lines++;
			String[] words = line.split(",");
			// count = words.length;
			count += words.length;
			// System.out.println(count);
		}

		System.out.println("Number of lines: " + lines);
		System.out.println("Number of Words:" + count);
		bufferedreader.close();
		scanner.close();
		File file = new File("C:\\Users\\Vaishnavi\\Desktop\\Training\\StudentDetails.control");
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileOutputStream fileOutputStream = null;
		fileOutputStream = new FileOutputStream(file);
		fileOutputStream.write(("Number of lines" + lines).getBytes());
		fileOutputStream.write(("Number of words:" + count).getBytes());
//		OutputStreamWriter osw = new OutputStreamWriter(fileOutputStream);
//		osw.write("\n Number of lines" + lines);
//		osw.write("\n Number of words" + count);
		///do not close
//		fileOutputStream.close();
//		osw.close();
	}

}
