package i190655_A3;

import java.util.LinkedList;
import java.util.Vector;
import java.lang.Thread;

public class Main {
	
	static BST b = new BST();
	static LinkedList<WordCount> Word = new LinkedList<WordCount>();
	static Vector<String> vector = new Vector<String>(); 
	static Query q;
	
	
	public static void main(String[] args) {  
		
		 LinkedList<Input1> L = new LinkedList<Input1>();
		 
		int j=0;
		
		String[] argumentlist = args;
		
		Vocabulary v = new Vocabulary(argumentlist[0]);
		int n = argumentlist.length;
		
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
			    v.setName(argumentlist[0]);  
                v.start();   
			}
			
			else 
			{
				L.add(i-1,new Input1(argumentlist[i]));
				L.get(i-1).setName(argumentlist[i]);
				L.get(i-1).start();
			}
			
		}
		
		try {
			
			v.join();
			
		} catch (InterruptedException e) {
			
									// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
         while(j < n-1)
         {
        	 try {
        		 
				L.get(j).join();
				j++;
				
			} catch (InterruptedException e) {
									// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	 
         }
         
         DisplayMenu dm = new DisplayMenu();
     	 dm.displaymenu(argumentlist);
     	
	
	}

}
