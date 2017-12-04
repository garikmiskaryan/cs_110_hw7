import Animals.*;
import utils.*;

public class Driver {
	public static void main(String[] args) {
		
		//Creating puppies

		Puppy pup1 = new Puppy("Joey"); 
		Puppy pup2 = new Puppy("Chandler");
		Puppy pup3 = new Puppy("Ross");

		// Getting their names and printing them

		System.out.println(pup1.puppyName());
		System.out.println(pup2.puppyName());
		System.out.println(pup3.puppyName());

		//Reversing an array, stringifying it and then printing

		int[] variable1 = new int[]{9, 20, 3, 44, 88, 300};
		int[] outcome1 = ArrayUtils.reverse(variable1); //reversing
		String stringifiedResult1 = ArrayUtils.stringifyArray(outcome1); //stringifying
		System.out.println(stringifiedResult1); //printing

		//Casting a double number to an integer,
		// Passing it to the method factorial and printing the result

		double num1 = 15.4;
		System.out.println(Math.factorial((int) num1));
	}
}