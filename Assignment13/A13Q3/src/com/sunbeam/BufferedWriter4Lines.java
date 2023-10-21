package com.sunbeam;


import java.io.BufferedWriter;

import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriter4Lines {
	
		public static void main(String[] args) {
			
			try(FileWriter fr = new FileWriter("A13Q3File.txt"))
			{
				
					try(BufferedWriter bwr = new BufferedWriter(fr))
					{
						System.out.println("Enter 4 lines");
						Scanner sc = new Scanner(System.in);
						for(int i=1; i<=4;i++)
						{
							//System.out.println("Enter line");
							String line = sc.nextLine();
							bwr.write(line);
							bwr.newLine();
						}
					}
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}		
			}
}
