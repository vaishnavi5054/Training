package com.training.filesHomework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class MovingFile {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sourcepath for your file: ");
		String source = scanner.next();
		System.out.println("Path is:" + source);
		File sourcefile = new File(source);
		System.out.println("Enter destination path for you file:  ");
		String destination = scanner.next();
		System.out.println("Destination path is:" + destination);
		File destinationfile = new File(destination);
		scanner.close();
		InputStream inStream = new FileInputStream(sourcefile);
		OutputStream outStream = new FileOutputStream(destinationfile);
		byte[] buffer = new byte[1024];
		int length;
		while ((length = inStream.read(buffer)) > 0) {
			outStream.write(buffer, 0, length);
		}
		inStream.close();
		outStream.close();
		sourcefile.delete();
	}
}
