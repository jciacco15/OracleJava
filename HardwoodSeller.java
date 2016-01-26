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
				
		}
		
	
	}
	
}
