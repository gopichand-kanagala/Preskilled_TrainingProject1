package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingDataFromFile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.creating a file
				File f=new File("C:\\RamGopi\\RamGopichand.csv");
				try{
					f.createNewFile();//there is a chance of gettingException.we need to handle exception by using 1.try and catch 2.throws
					System.out.println("File Was Created Successfully");
					
					//2.Write Data into file
					BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\RamGopi\\RamGopichand.csv", true));

		            // Optional: write header only once
		            writer.write("Name,Age,Department");
		            writer.newLine();

		            // Write some data
		            writer.write("Gopi,22,IT");
		            writer.newLine();
		            writer.write("Ravi,25,HR");
		            writer.newLine();
		            writer.write("Lakshmi,23,Finance");
		            writer.newLine();

		            writer.close();
		            System.out.println("CSV file updated successfully.");
					//3.Read Data from File
					FileReader fr=new FileReader(f);
					BufferedReader br=new BufferedReader(fr);
					String s =br.readLine();
					while(s!=null) {
						try{
							Thread.sleep(1000);//stops The Excecution Of Thread for 1000 milliseconds,
							System.out.println(s);
							s=br.readLine();
						}catch(InterruptedException ie) {
							System.out.println("InterruptedException:"+ie);
						}
					}
					
				}catch(IOException i) {
					System.out.println(i);
				}

	}

}
