import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class HardwoodSeller {

	public static void main(String args[]) throws FileNotFoundException{
		
		ArrayList<Integer> bF = new ArrayList<Integer>();
		ArrayList<String> woodType = new ArrayList<String>();
		//read file
		if(args.length != 0){
			Scanner lineScanner = new Scanner(new File(args[0]));
			//read line containing name, address and date
			String firstLine = lineScanner.nextLine();
			System.out.println(firstLine);
			
			//read line containing wood types and bf
			
			String woodOrder = lineScanner.nextLine();
			
			//replace semicolons and colons with blankspace
			woodOrder = woodOrder.replace(';', ' ');
			woodOrder = woodOrder.replace(':', ' ');
			//System.out.println(woodOrder);
			
			
			//add wood names and BF to respective ArrayList
			StringTokenizer s = new StringTokenizer(woodOrder);
			System.out.println(s.countTokens());
			while(s.hasMoreTokens()){
				String word = s.nextToken();
				if((word.equals("White"))){
					String appendString = "White ";
					appendString += s.nextToken();
					woodType.add(appendString);
					bF.add(Integer.parseInt(s.nextToken()));
				}
				else{
					woodType.add(word);
					bF.add(Integer.parseInt(s.nextToken()));
				}
			}
			
			//print out wood type for testing
			for(int i=0; i < woodType.size(); i++){
				System.out.println(woodType.get(i));
				if(woodType.get(i).equals("Cherry")){
					System.out.println("yes");
				}
			}
			
			//print out BF for testing
			for(int j=0; j < bF.size(); j++){
				System.out.println(bF.get(j));
			}
			
				
		}
		
		
	
	}
	
}
