package Academy;

public class PrimitvetypeChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte myByteValue = 10; // variable type byte
		
		short myShortValue = 20; // variable type short
		
		int myIntValue = 50; // variable type int
		
		long myLongValue = 50000L + 10L * ( myByteValue + myShortValue + myIntValue ); // variable type long. 
		
		System.out.println(myLongValue); // print the total from my Long Value 
		
		short shortTotal = (short) ( 1000 + 10 * ( myByteValue + myShortValue + myIntValue )); // this line print short #. used casting since int is set as default
		
		System.out.println(shortTotal); // print short total

	}

}
