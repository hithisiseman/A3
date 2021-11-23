package i190655_A3;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Query extends Thread{
	
	String file,query;
	
	Query(String f,String q){
		
		this.file=f;
		this.query=q;
	}
	
	public void run()
	{
		
		try {
			Scanner scan=new Scanner(file);
			
				Main.q.handlequery();
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void handlequery() throws FileNotFoundException {
		
		int len=query.length();
	
		String[] words=query.split("\\s");	//splits the string based on whitespace  
		
		 boolean flag = false;
	     int count = 0;
	     boolean found = false;
	      
		for(String w:words){  
			
	      Scanner sc2 = new Scanner(new FileInputStream(file));
	    
	      while(sc2.hasNextLine()) {
	    	 
	         String line = sc2.nextLine();
	         
	         if(line.indexOf(w)!=-1) {
	           
	        	 found=true;
	        	 flag = true;
	             count = count+1;
	         }
	      }
	      
	      if(flag) {
	    	  
		         System.out.println("File " + file +" contains '" + w +"'");
		         System.out.println("Frequency of '" + w + "':" + count);
		      } 
		      
		  else {
		         System.out.println("File " + file +" does not contain '" + w +"'");
		      }
			
	      
		}
	      
	      if(!found){
				throw new FileNotFoundException("File does not exist");
			}
	      
	     
	}

}
