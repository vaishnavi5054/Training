package com.training.filesHomework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class CopyFile {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sourcepath for your file: ");
		String source = scanner.next();
		System.out.println("Path is:" + source);
		// File sourcefile = new File(source);
		System.out.println("Enter destination path for you file:  ");
		String destination = scanner.next();
		System.out.println("Destination path is:" + destination);
		// File destinationfile = new File(destination);
		scanner.close();
		/*
		 * InputStream inStream = new FileInputStream(sourcefile); OutputStream
		 * outStream = new FileOutputStream(destinationfile); byte[] buffer =
		 * new byte[1024]; int length; while ((length = inStream.read(buffer)) >
		 * 0){ outStream.write(buffer, 0, length); } inStream.close();
		 * outStream.close(); sourcefile.delete();
		 */
		copyFileUsingStream(source, destination);
	}

	private static void copyFileUsingStream(String source, String destination) throws IOException {
		// TODO Auto-generated method stub
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(destination);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
		} finally {
			is.close();
			os.close();
		}

	}

}
