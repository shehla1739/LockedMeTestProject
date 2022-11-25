package com.lockedme;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class AppLockedMe {

	public static void main(String[] args) throws IOException {
		FileUtil util = new FileUtil();
		int ch;
		System.out.println("\n Project Name : LockedMe.com");
		System.out.println("\n Developer Name : Shehla Kulsum Khan Baig \n");
		Scanner sc = new Scanner(System.in);
		
		do {
				System.out.println("\n1.  Display Files in Directory");
				System.out.println("2.  Perform Add,Delete, Search operations on files");
				System.out.println("3.  Exit App");
				System.out.println("\n Enter the choice");
				ch = sc.nextInt();
				
				if (ch>3 && ch<0) {
						System.out.println("Invalid Choice, Please try again");				   
				} 
				else {
						switch (ch) {
						case 1:
							List<MyFile> files = util.getFiles();
							for (MyFile f : files)
								System.out.println(f.getId() + "\t" + f.getFileName());
							break;						
						case 2:								
								FileInterface fi= new FileInterface();
								fi.fileOperation();
						case 3:
							System.out.println("You choose to exit, Thanks!");
							break;
						}		// switch						
				} //else					
		   }while (ch<3);		//do 
	   }  //main
	}//class
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				