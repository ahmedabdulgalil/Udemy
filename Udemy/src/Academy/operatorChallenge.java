package Academy;

public class operatorChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1- create a double variable of Value 20.00
		// 2- Create a second  double variable of value 80.00
		// 3- add both numbers together and multiply by 100.00
		// 4- use the remainder operator to figure out what the remainder from the result of the operation in step 3 and 40.00
		//    we used the modulus or reminder operator on ints but you can use Double 
		// 5- create a boolean variable that assign the value true if the remainder in #4 is 0, or false if its not 0.
		// 6- output the boolean variable
		// 7- write an if-then statement that displays a message "Got some remainder if boolean in step 5 is not true. 
		
		
		double firstNewValue = 20.00d; // step 1
		double secondNewValue = 80.00d; // step 2
	
		double totalValue = (firstNewValue + secondNewValue) * 100.00d; // step 3
		
		System.out.println(" total value is " + totalValue);
		
		double remainderValue = totalValue % 40.00d; // step 4
		
		System.out.println(" my remainder value is " + remainderValue);
		
		boolean remainderNewValue = ( remainderValue == 0) ? true : false;  // Step 5
		
		System.out.println(" remainder value is " + remainderNewValue); // step 6
		
		if (!remainderNewValue) { // step 7
			
			System.out.println("Got some remainder");
		}
		

	}

}
