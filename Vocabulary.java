package i190655_A3;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;
import java.lang.Thread;
import java.lang.Runnable;

public class Vocabulary extends Thread {
	
		String filename;
		Vocabulary(String f)
		{
			this.filename=f;
		}
	
		public void run()
		{
			
			File file = new File(this.filename); 
			try {
				Scanner scan=new Scanner(file);
				while(scan.hasNextLine())
				{
					 Main.b.insert(scan.next());  
				}
				 
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	        
}
