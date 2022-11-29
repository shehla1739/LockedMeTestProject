package com.lockedme;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AppLockedMe {

	public static void main(String[] args) throws IOException {
		FileUtil util = new FileUtil();
		int ch;
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n Project Name : LockedMe.com");
		System.out.println(" Developer Name : Shehla Kulsum Khan Baig \n");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n");
		 System.out.println("\n Welcome to LockedMe.com \n ");
	 	Scanner sc = new Scanner(System.in);
	 	try {
			do {				   
					System.out.println(" \n Enter your choice: ");
					System.out.println("\n1.  Display Files in Directory");
					System.out.println("2.  Perform Add, Delete, Search operations on files");
					System.out.println("3.  Exit App");
					ch = sc.nextInt();
						if (ch<0 && ch>3) {							
								System.out.println("Invalid Choice, Please try again");				   
						} 
						else {
								switch (ch) {
								case 1:
									System.out.println("---------------------------------------");
									System.out.println("Files listed in ascending order: ");
									System.out.println("---------------------------------------");
									List<MyFile> files = util.getFiles();
									for (MyFile f : files)
										System.out.println(f.getId() + "\t" + f.getFileName());
									break;						
								case 2:								
									FileInterface fi= new FileInterface();
									fi.fileOperation(); 
									break;						
								case 3:
									System.out.println("You choose to exit, Thanks!");
									break;
								default:
										throw new NumberFormatException();								
									//continue;  // continue loop until user enter correct code
								}		// switch						
						} //else			
			}  while (ch<3);		//do

		}catch(NumberFormatException e) {
			System.out.print("Your selection can only be an integer between 1 to 3!");
		}
		catch (InputMismatchException e){
	          System.out.print("Your selection can only be an integer between 1 to 3!");
	     }finally {
	    	 sc.close();
	     }
	   }  //main
	}//class
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				