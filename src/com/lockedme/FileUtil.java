package com.lockedme;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FileUtil {
	
	//static block  -- executes first
	{
		//add 1 file to initialize empty directory
		try {
				File f= new File("E://java//test123.txt");
				f.createNewFile();
		} catch(IOException ioexcep) {
			ioexcep.printStackTrace();		}
		
	}
static int count =0;
List<MyFile> files = new ArrayList<>();
public FileUtil() {
	File f = new  File("E://java");
	String[] fs=f.list();
	for (String file:fs) {
		count++;
		files.add(new MyFile(count,file));		
	}
} 

//get file
public List<MyFile> getFiles() throws IOException{
	files.clear();
	count=0;
	File f = new File("E://java");
	//String[] fs=f.list();
	List<String> fs = Arrays.asList(f.list());
	Collections.sort(fs);
	for(String file:fs)
	{
		count++;
		files.add(new MyFile(count,file));
	}
	return files;
	
	
}

//add file
public boolean addFile(String fileName) throws IOException{
	boolean isAdded = false;
	File f= new File("E://java//" + fileName + ".txt");
	f.createNewFile();
	isAdded=true;
	return isAdded;
}

//delete file
public boolean deleteFile(String fileName) throws IOException {
		boolean isDeleted=false;
		files=getFiles();
		for(MyFile file:files)
		{
			if(file.getFileName().startsWith(fileName))
			{
				File f=new File("E://java//"+file.getFileName());
				f.delete();
				isDeleted=true;
				break;
			}
		}
		return isDeleted;
	}

//search
public boolean searchFile(String fileName) throws IOException{
	boolean isFileExist = false;
	files = getFiles();
	for(MyFile file:files) {
		if(file.getFileName().startsWith(fileName)) {
			isFileExist=true;
			break;
		}		
	}
	return isFileExist;
}


}
