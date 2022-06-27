import java.util.Scanner;
//Homework6
public class Guess_A_Number {
	public static void main(String[]args) {
	  
	    int numberofguesses=0;
	  boolean response =true ;
	   
	  
		   
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Guess the secret number.");
		System.out.println();
		System.out.println("Enter Maximum value for secret number:");
		int max = scan.nextInt();
		System.out.println("A New Secret number has been chosen.");
		
		 while(response){
			 
			 while(response) {
				 int secretNumber = (int) (Math.random() * max) + 1;
			 System.out.println("Enter Guess:");
			 int guess = scan.nextInt();
			 numberofguesses ++;
			 if (guess > secretNumber) {
				 System.out.println("too high, try again.");
				 
			 }else if(guess < secretNumber) { 
				 System.out.println("too low, try again.");
			 }else {
				 
				 System.out.println("you won in "+ numberofguesses+ " Guesses!");
				 System.out.println();
				 System.out.println("Play Again(y/n)");
				 switch(scan.next().trim()) {
				 case"y":
					 response=true;
					 break;
				 case"n":
					 response=false;
						 break;
						 default:
							 break;
				 }
				 while(response!=true) {
					  System.out.println("Until next time");
					  break;
				  }
		  }
	  }
	}
  }
}
