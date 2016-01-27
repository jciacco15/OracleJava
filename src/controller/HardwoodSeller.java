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
			
			
			//read line containing wood types and bf
			
			String woodOrder = lineScanner.nextLine();
			
			//replace semicolons and colons with blankspace
			woodOrder = woodOrder.replace(';', ' ');
			woodOrder = woodOrder.replace(':', ' ');
			//System.out.println(woodOrder);
			
			
			//add wood names and BF to respective ArrayList
			StringTokenizer s = new StringTokenizer(woodOrder);
			//System.out.println(s.countTokens());
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
			
			
			calculate(woodType, bF, firstLine);
		}
		
		
	
	}
	
	public static void calculate(ArrayList<String> wood, ArrayList<Integer> boardFoot, String name){
		
		double price = 0;
		double deliveryTime = 0;
		double cherryPrice = 0;
		double wengePrice = 0;
		double whiteOakPrice = 0;
		double sawdustPrice = 0; 
		double maplePrice = 0;
		double mahoganyPrice =0;
		
		//calculate price and delivery time
		for(int i=0; i < wood.size(); i++){
			if(wood.get(i).equals("Cherry")){
				price += boardFoot.get(i) * 5.95;
				cherryPrice = boardFoot.get(i) * 5.95;
				if(boardFoot.get(i) >=1 && boardFoot.get(i) <=100){
					deliveryTime += 2.5*1;
				}
				else if(boardFoot.get(i) >=101 && boardFoot.get(i) <=200){
					deliveryTime += 2.5*2;
				}
				else if(boardFoot.get(i) >=201 && boardFoot.get(i) <=300){
					deliveryTime += 2.5*3;
				}
				else if(boardFoot.get(i) >=301 && boardFoot.get(i) <=400){
					deliveryTime += 2.5*4;
				}
				else if(boardFoot.get(i) >=401 && boardFoot.get(i) <=500){
					deliveryTime += 2.5*5;
				}
				else if(boardFoot.get(i) >=501 && boardFoot.get(i) <=1000){
					deliveryTime += 2.5*5.5;
				}
			}
			else if(wood.get(i).equals("Wenge")){
				price += boardFoot.get(i) * 22.35;
				wengePrice = boardFoot.get(i) * 22.35;
				if(boardFoot.get(i) >=1 && boardFoot.get(i) <=100){
					deliveryTime += 5*1;
				}
				else if(boardFoot.get(i) >=101 && boardFoot.get(i) <=200){
					deliveryTime += 5*2;
				}
				else if(boardFoot.get(i) >=201 && boardFoot.get(i) <=300){
					deliveryTime += 5*3;
				}
				else if(boardFoot.get(i) >=301 && boardFoot.get(i) <=400){
					deliveryTime += 5*4;
				}
				else if(boardFoot.get(i) >=401 && boardFoot.get(i) <=500){
					deliveryTime += 5*5;
				}
				else if(boardFoot.get(i) >=501 && boardFoot.get(i) <=1000){
					deliveryTime += 5*5.5;
				}
			}
			else if(wood.get(i).equals("Sawdust")){
				price += boardFoot.get(i) * 1.5;
				sawdustPrice = boardFoot.get(i) * 1.5;
				if(boardFoot.get(i) >=1 && boardFoot.get(i) <=100){
					deliveryTime += 1;
				}
				else if(boardFoot.get(i) >=101 && boardFoot.get(i) <=200){
					deliveryTime += 2;
				}
				else if(boardFoot.get(i) >=201 && boardFoot.get(i) <=300){
					deliveryTime += 3;
				}
				else if(boardFoot.get(i) >=301 && boardFoot.get(i) <=400){
					deliveryTime += 4;
				}
				else if(boardFoot.get(i) >=401 && boardFoot.get(i) <=500){
					deliveryTime += 5;
				}
				else if(boardFoot.get(i) >=501 && boardFoot.get(i) <=1000){
					deliveryTime += 5.5;
				}
			}
			else if(wood.get(i).equals("White Oak")){
				price += boardFoot.get(i) * 6.70;
				whiteOakPrice = boardFoot.get(i) * 6.70;
				if(boardFoot.get(i) >=1 && boardFoot.get(i) <=100){
					deliveryTime += 2.3*1;
				}
				else if(boardFoot.get(i) >=101 && boardFoot.get(i) <=200){
					deliveryTime += 2.3*2;
				}
				else if(boardFoot.get(i) >=201 && boardFoot.get(i) <=300){
					deliveryTime += 2.3*3;
				}
				else if(boardFoot.get(i) >=301 && boardFoot.get(i) <=400){
					deliveryTime += 2.3*4;
				}
				else if(boardFoot.get(i) >=401 && boardFoot.get(i) <=500){
					deliveryTime += 2.3*5;
				}
				else if(boardFoot.get(i) >=501 && boardFoot.get(i) <=1000){
					deliveryTime += 2.3*5.5;
				}
			}
			else if(wood.get(i).equals("Curly Maple")){
				price += boardFoot.get(i) * 6.00;
				maplePrice = boardFoot.get(i) * 6.00;
				if(boardFoot.get(i) >=1 && boardFoot.get(i) <=100){
					deliveryTime += 1.5*1;
				}
				else if(boardFoot.get(i) >=101 && boardFoot.get(i) <=200){
					deliveryTime += 1.5*2;
				}
				else if(boardFoot.get(i) >=201 && boardFoot.get(i) <=300){
					deliveryTime += 1.5*3;
				}
				else if(boardFoot.get(i) >=301 && boardFoot.get(i) <=400){
					deliveryTime += 1.5*4;
				}
				else if(boardFoot.get(i) >=401 && boardFoot.get(i) <=500){
					deliveryTime += 1.5*5;
				}
				else if(boardFoot.get(i) >=501 && boardFoot.get(i) <=1000){
					deliveryTime += 1.5*5.5;
				}
			}
			else if(wood.get(i).equals("Genuine Mahogany")){
				price += boardFoot.get(i) * 9.60;
				mahoganyPrice = boardFoot.get(i) * 9.60;
				if(boardFoot.get(i) >=1 && boardFoot.get(i) <=100){
					deliveryTime += 3*1;
				}
				else if(boardFoot.get(i) >=101 && boardFoot.get(i) <=200){
					deliveryTime += 3*2;
				}
				else if(boardFoot.get(i) >=201 && boardFoot.get(i) <=300){
					deliveryTime += 3*3;
				}
				else if(boardFoot.get(i) >=301 && boardFoot.get(i) <=400){
					deliveryTime += 3*4;
				}
				else if(boardFoot.get(i) >=401 && boardFoot.get(i) <=500){
					deliveryTime += 3*5;
				}
				else if(boardFoot.get(i) >=501 && boardFoot.get(i) <=1000){
					deliveryTime += 3*5.5;
				}
			}
		}
		
		//print out entire wood order
		System.out.println("Wood Order:");
		System.out.println(name);
		for(int i=0; i < wood.size(); i++){
			System.out.print(wood.get(i) + ", BF: " + boardFoot.get(i));
			if(wood.get(i).equals("Cherry")){
				System.out.println(", Price: $" + cherryPrice);
			}
			else if(wood.get(i).equals("Wenge")){
				System.out.println(", Price: $" + wengePrice);
			}
			else if(wood.get(i).equals("White Oak")){
				System.out.println(", Price: $" + whiteOakPrice);
			}
			else if(wood.get(i).equals("Curly Maple")){
				System.out.println(", Price: $" + maplePrice);
			}
			else if(wood.get(i).equals("Genuine Mahogany")){
				System.out.println(", Price: $" + mahoganyPrice);
			}
			else if(wood.get(i).equals("Sawdust")){
				System.out.println(", Price: $" + sawdustPrice);
			}
		}
		System.out.println("Total Price: $" + price);
		System.out.println("Delivery Time: " + deliveryTime + " hours");
	}
	
}
