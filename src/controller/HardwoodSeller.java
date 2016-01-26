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
				else if((word.equals("Genuine"))){
					String appendString = "Genuine ";
					appendString += s.nextToken();
					woodType.add(appendString);
					bF.add(Integer.parseInt(s.nextToken()));
				}
				else if((word.equals("Curly"))){
					String appendString = "Curly ";
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
			
			calculate(woodType, bF, firstLine);
		}
		
		
	
	}
	
	public static void calculate(ArrayList<String> wood, ArrayList<Integer> boardFoot, String name){
		
		double price = 0;
		double deliveryTime = 0;
		for(int i=0; i < wood.size(); i++){
			if(wood.get(i).equals("Cherry")){
				price += boardFoot.get(i) * 5.95;
			}
			else if(wood.get(i).equals("Wenge")){
				price += boardFoot.get(i) * 22.35;
			}
			else if(wood.get(i).equals("Sawdust")){
				price += boardFoot.get(i) * 1.5;
			}
			else if(wood.get(i).equals("White Oak")){
				price += boardFoot.get(i) * 6.70;
			}
			else if(wood.get(i).equals("Curly Maple")){
				price += boardFoot.get(i) * 6.00;
			}
			else if(wood.get(i).equals("Genuine Mahogany")){
				price += boardFoot.get(i) * 9.60;
			}
		}
		
		System.out.println("Price: " + price);
		
	}
	
}
