package com.training.filesHomework;

import java.io.*;

public class FileReader {

	public FileReader(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException {
		String filename = "C:\\Users\\VAISHNAVI\\Desktop\\StudentDetails.txt";
		try{
			BufferedReader bufferedreader = new BufferedReader(new java.io.FileReader(filename));
		//FileReader filereader = new FileReader(filename);
		//BufferedReader bufferedreader = new BufferedReader(new FileReader(filename));
		String eachline;
		//eachline = inputfile.readLine();
		while((eachline = bufferedreader.readLine()) != null){
			String[] values = eachline.split(" ");
			for(String str : values){
//				String[] parts = str.split(" ");
//				for(String str1: parts){
//					System.out.println(str1);
//				}
//				System.out.print("\n");
				System.out.println(str);
				
			}
//	System.out.println(eachline);
		}
		bufferedreader.close();
	}
	catch(IOException e){
		System.out.println("File read error");
	}

}
}
