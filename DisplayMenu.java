package i190655_A3;

import java.util.Scanner;
import java.util.Vector;

public class DisplayMenu {
	
	
	String[] files;
	
		public void displaymenu(String[] f){
			
				this.files=f;
				int option;
			
				while(true){
					
					System.out.println("\t\t\t\t\t-------------Welcome to Console-based UI of Multithreading------------");
					System.out.println("Please choose among the following options by entering number of option:-");
					System.out.println("(1) Display BST build from Vocabulary File.");
					System.out.println("(2) Display Vectors build from Input files.");
					System.out.println("(3) View Match words and its frequency.");
					System.out.println("(4) Search a query,displaying all the files query found in.");
					System.out.println("(5) Enter 5 for Exit.");
					
				    Scanner sc=new Scanner (System.in);
				    option=sc.nextInt();
				    
				    switch(option) {
					    
					    case 1:
					   	 	Main.b.inorderTraverse(Main.b.root);  
					    	break;
					    
					    case 2:
					    	System.out.println("Vectors that are build: " + Main.vector);
					    	break;
					    
					    case 3:
					    	
					    	int n= Main.Word.size();
					    	for(int i=0;i < n; i++)
							 {
								System.out.println("Word '" + Main.Word.get(i).getWord() + "' has frequency " + Main.Word.get(i).getFrequency()); 		
							 }
					    	
					    	break;
					    
					    case 4:
					    	
					    	Scanner scan= new Scanner(System.in); 
							System.out.print("Enter query: ");  
							String query= scan.nextLine();              //reads string   
							
					    		for(int i=0;i<this.files.length;i++) {
					    			
					    			Main.q = new Query(this.files[i],query);
					    			Main.q.start();
					    			
					    			try {
						    			
						    			Main.q.join();
						    			
						    		} catch (InterruptedException e) {
						    			
						    									// TODO Auto-generated catch block
						    			e.printStackTrace();
						    		}
					    		}
					    		
					    		
					    	
					    	
					    	break;
					    
					    case 5: 
					    	System.out.println("Program Terminated.");
					    	return;
					    	
					    default:	
					    	System.out.println("Invalid Input. Try again!!");
					    	continue;
				    }
				    
		   }
		}
		
		
}
