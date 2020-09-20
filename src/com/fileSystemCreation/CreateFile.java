package com.fileSystemCreation;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//File f= new File("D:\\Workspace_Syne\\Test.txt");
		//File f= new File("D:\\Workspace_Syne\\Test.xlsx");
		File f= new File("D:\\Workspace_Syne\\Test.bmp");
		
		f.createNewFile();
		System.out.println("Done");
	}

}
