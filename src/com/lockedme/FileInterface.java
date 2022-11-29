
package com.lockedme;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FileInterface {
	public void fileOperation() throws IOException {
		FileUtil util = new FileUtil();
		int ch;
		Scanner sc = new Scanner(System.in);
		try {
			do {
				System.out.println("\n Enter your choice: \n");
				System.out.println("1.Add File");
				System.out.println("2.Delete File");				
				System.out.println("3.search");
				System.out.println("4.Diaplay Files");
				System.out.println("5.Go back to main menu");

				ch = sc.nextInt();
				if (ch>5 && ch<0) {
						System.out.println("Invalid Choice, Please try again");
					    ch = sc.nextInt();
				}
				else {
						switch (ch) {
						case 1:
							System.out.println("---------------------------------------");
							System.out.println("Create new file");
							System.out.println("---------------------------------------");
							String fileName;
							System.out.println("Enter the filename you want to create:");
							fileName=sc.next();
							boolean fileCreated = util.addFile(fileName);
							if (fileCreated==true)
								System.out.println("The file " + fileName + " successfully created");
							else
								System.out.println("The file " + fileName + " cannot be created");
							break;
						case 2:
							System.out.println("---------------------------------------");
							System.out.println("Delete file");
							System.out.println("---------------------------------------");
							String fileName1;
							System.out.println("Enter the filename you want to delete:");
							fileName1=sc.next();
							boolean fileDeleted=util.deleteFile(fileName1);
							if (fileDeleted==true)
								System.out.println("The file " + fileName1 + " successfully deleted");
							else
								System.out.println("Please check file name is correct \n Unable to delete file " + fileName1);
							break;
						case 3:
							String fileName2;
							System.out.println("---------------------------------------");
							System.out.println("Search a file");
							System.out.println("---------------------------------------");
							System.out.println("Enter File name you want to search for:");
							fileName2=sc.next();						
								if(util.searchFile(fileName2))
									System.out.println("The File " + fileName2 + " exists in system");
								else
									System.out.println("Sorry, the File " + fileName2 + " does not exists in system");
							break;
						case 4:
							System.out.println("---------------------------------------");
							System.out.println("Display list of files in ascending order");
							System.out.println("---------------------------------------");
							List<MyFile> files = util.getFiles();
							for (MyFile f : files)
								System.out.println(f.getId() + "\t" + f.getFileName());
							break;
						
						case 5:
							System.out.println("---------------------------------------");
							System.out.println("You choose go back to main menu");
							System.out.println("---------------------------------------");							
							break;
					}   //switch
				}    //else			
			 } while(ch<5);   //do
		}catch(NumberFormatException e) {
			System.out.print("Your selection can only be an integer between 1 to 3!");
		}
		catch (InputMismatchException e){
	          System.out.print("Your selection can only be an integer between 1 to 3!");
	     }
	}		//main
}  //class
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				