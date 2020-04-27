package Academy;

public class ifStatement {

	public static void main(String[] args) {
		
		boolean isAlien = false;
		if (isAlien == false) {
			System.out.println("it is not an alien!");
			System.out.println("and im scared of alien");
		}
			
		int topScore = 80;
		if (topScore < 100) {
			
			System.out.println(" you got the highest score");
		}
		
		int secondTopScore = 95;
		
		if ( (topScore > secondTopScore) && (topScore < 100)) { // check both operand and both need to be true 
			System.out.println(" Greater than top score and less than 100");
		}
		
		if ((topScore > 90) || (secondTopScore < 90 )) {
			
			System.out.println(" either  or both of the conditions are true");
		}
		
		int newValue = 50;
		
		if (newValue == 50) {
			System.out.println(" this is true");
		}
		
		Boolean isCar = false;
		if (!isCar) {
			
			System.out.println(" this is not supposed to happen");
		}
		
		isCar = true; 
		boolean wasCar = isCar ? true : false; 
	
		if (wasCar) { 
			System.out.println(" wasCar is true");
		}
		
		int ageOfClient = 20;
		
		boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
		
		if (isEighteenOrOver) {
			
			System.out.println(" this is true");
		}
		
		
		
		

	}

}
