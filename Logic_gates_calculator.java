package Java_Challenges;

import java.util.Scanner;

public class Logic_gates_calculator {

	@SuppressWarnings("resource")
	public static void menu() {
		Scanner response = new Scanner(System.in);
		System.out.println("Want to calculate more solutions?");
		String Response = response.nextLine();
		if (Response.toLowerCase().equals("yes")) {
			main(null);
		}
		else if (Response.toLowerCase().equals("no")) {
			System.out.println("See you later.");
		}
		else {
			System.out.println("Error.");
		}
		
	}
	
	public static void main(String[] args) {
		int X = 0;
		int Y = 0;
	
		Scanner Xinput = new Scanner(System.in);
		System.out.println("Enter first value (1 or 0):");
		X = Xinput.nextInt();	
		if (X > 1 || X < 0) {
			System.out.println("Invalid input.");
			menu();
		}
		
		Scanner Yinput = new Scanner(System.in);
		System.out.println("\nEnter second value (1 or 0):");
		Y = Yinput.nextInt();
		if (Y > 1 || Y < 0) {
			System.out.println("Invalid input.");
			menu();
		}
		
		int Ans = X + Y;
		
	    Scanner input = new Scanner(System.in);
	    System.out.println("What gate? AND, OR, NAND, NOR or XOR?");
	    String LogicGates = input.nextLine();		

		switch (LogicGates.toUpperCase()) {
		  case "AND": 
		    System.out.println("AND");
		    if (Ans == 2) {
		    	System.out.println("Answer is 1");
		    }
		    else if (Ans == 1 || Ans == 0) {
		    	System.out.println("Answer is 0");
		    }
		    break;
		  case "OR": 
			    System.out.println("OR");
			    if (Ans == 2 || Ans == 1) {
			    	System.out.println("Answer is 1");
			    }
			    else if (Ans == 0) {
			    	System.out.println("Answer is 0");
			    }			    
			    else {
			    	System.out.println("Error.");
			    }
			    break;
		  case "XOR": 
			    System.out.println("XOR");
			    if (Ans == 2 || Ans == 0) {
			    	System.out.println("Answer is 0");
			    }
			    else if (Ans == 1) {
			    	System.out.println("Answer is 1");
			    }
			    else {
			    	System.out.println("Error.");
			    }
			    break;
		  case "NAND": 
			    System.out.println("NAND");
			    if (Ans == 2) {
			    	System.out.println("Answer is 0");
			    }
			    else if (Ans == 1 || Ans == 0) {
			    	System.out.println("Answer is 1");
			    }
			    else {
			    	System.out.println("Error.");
			    }
			    break;
		  case "NOR": 
			    System.out.println("NOR");
			    if (Ans == 2 || Ans == 1) {
			    	System.out.println("Answer is 0");
			    }
			    else if (Ans == 0) {
			    	System.out.println("Answer is 1");
			    }
			    else {
			    	System.out.println("Error.");
			    }
			    break;			    
		  default:
		    System.out.println("Logic gate not found.");
		}
			
		menu();
		
		input.close();
		Xinput.close();
		Yinput.close();
	}
}