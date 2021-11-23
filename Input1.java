package i190655_A3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import java.lang.Thread;
import java.lang.Runnable;

public class Input1 extends Thread {

		String file;
		
		Input1(String f){
			
			this.file=f;
		}
		
		 public void run()
		 {
			 
			 File file = new File(this.file);
			  
			  try {
					Scanner scan=new Scanner(file);
					while(scan.hasNextLine())
					{
					    Main.vector.add(scan.next());  
					}
				
			  }
			  catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			  Scanner scan1;
			  
			try {
				
				scan1 = new Scanner(file);
				
				String word; 
				
				int i=0;
				while(scan1.hasNextLine())
				{
				    word=scan1.next();
				   
				    boolean found = Main.b.search(word);
				  
				    if(found==true)
				    	
				    {
				    	boolean find=false;
				    	
				    	int n=Main.Word.size();
				    	
				    	for(int j=0;j<n;j++)
				    	{
				    		if(word.compareTo(Main.Word.get(j).getWord())==0) {
				    			find=true;
				    			Main.Word.get(j).setFrequency(Main.Word.get(j).getFrequency()+1);
				    		}
				    			
				    		
				    	}
				    	
				    	if(!find) {
				    		Main.Word.add(i,new WordCount(word,1));
				    		i++;
				    	}
			    			
				    }
				    
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		 }
		 
}
