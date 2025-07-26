package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingDataFromFile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.creating a file
		File f=new File("C:\\RamGopi\\RamGopichand.excel");
		try{
			f.createNewFile();//there is a chance of gettingException.we need to handle exception by using 1.try and catch 2.throws
			System.out.println("File Was Created Successfully");
			//2.Read Data from File
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
