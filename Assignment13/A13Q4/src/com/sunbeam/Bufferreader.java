package com.sunbeam;

import java.io.FileReader;
import java.io.BufferedReader;

public class Bufferreader {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("A13Q4File.txt"))
		{
			try(BufferedReader brd = new BufferedReader(fr))
			{
				String line;
				while(( line = brd.readLine()) != null){
					System.out.println(line);
				}
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
