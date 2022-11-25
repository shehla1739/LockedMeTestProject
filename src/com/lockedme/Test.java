package com.lockedme;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		FileUtil util = new FileUtil();
		int ch;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1.Add File");
			System.out.println("2.Delete File");
			System.out.println("3.Diaplay Files");
			System.out.println("4.search");
			System.out.println("5.exit");
			System.out.println("enter the choice");
			ch = sc.nextInt();
			if (ch>5 && ch<0) {
					System.out.println("Invalid Choice, Please try again");
				    ch = sc.nextInt();
			} else if(ch==5) {
				System.out.println("You choose to exit, Thanks!");
			} else {
					switch (ch) {
					case 1:
						String fileName;
						System.out.println("Enter the filename");
						fileName=sc.next();
						boolean fileCreated = util.addFile(fileName);
						if (fileCreated==true)
							System.out.println("The file " + fileName + " successfully created");
						break;
					case 2:
						String fileName1;
						System.out.println("Enter the filename");
						fileName1=sc.next();
						boolean fileDeleted=util.deleteFile(fileName1);
						if (fileDeleted==true)
							System.out.println("The file " + fileName1 + " successfully deleted");
						break;
					case 3:
						List<MyFile> files = util.getFiles();
						for (MyFile f : files)
							System.out.println(f.getId() + "\t" + f.getFileName());
						break;
					case 4:
						String fileName2;
						System.out.println("Enter File name");
						fileName2=sc.next();						
							if(util.searchFile(fileName2))
								System.out.println("The File " + fileName2 + " exists in system");
							else
								System.out.println("Sorry, the File " + fileName2 + " does not exists in system");
						break;
					case 5:
						System.out.println("You choose to exit, Thanks!");
						break;
			}   //switch
		}    //else			
	 } while(ch<5);   //do
	}		//main
}  //class
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				