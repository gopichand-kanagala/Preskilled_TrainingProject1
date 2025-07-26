package com.ExceptionHandling;


import java.io.File;
import java.io.IOException;
import java.io.FileReader;
public class ReadingDataFromFile {

	public static void main(String[] args) {
		//1.creating a file
		File f=new File("C:\\RamGopi\\gopi.txt");
		try{
			f.createNewFile();//there is a chance of gettingException.we need to handle exception by using 1.try and catch 2.throws
			System.out.println("File Was Created Successfully");
			//2.Read Data from File
			FileReader fr=new FileReader(f);
			int i=fr.read();
			while(i!=-1) {
				try{
					Thread.sleep(1000);//stops The Excecution Of Thread for 1000 milliseconds,
					System.out.print((char) i+" ");
					i=fr.read();
				}catch(InterruptedException ie) {
					System.out.println("InterruptedException:"+ie);
				}
			}
			
		}catch(IOException i) {
			System.out.println(i);
		}
		
	}

}
