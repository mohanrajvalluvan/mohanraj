package Assignment;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import au.com.bytecode.opencsv.CSVReader;


import au.com.bytecode.opencsv.CSVReader;

public class Day3_Ex5 {

		public static void main(String[] args) throws IOException  {

			
			CSVReader reader = new CSVReader(new FileReader("C:\\Users\\MohanrajValluvan\\eclipse-workspace\\Selenium_Assignment\\File.csv"));
			
			List<String[]> li=reader.readAll();
			System.out.println("Total rows which we have is "+li.size());
			
			Iterator<String[]>i1= li.iterator();
			
			while(i1.hasNext())
			{
				
				String[] str = i1.next();
				
				for(int i=0;i<str.length;i++)
				{
					System.out.println(" "+str[i]);
					
				}
				
				System.out.println("  ");
				
			}
		}
}
