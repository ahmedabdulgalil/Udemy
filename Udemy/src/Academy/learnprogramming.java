package Academy;

public class learnprogramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Int value
		int myValue = 1000;
		int myMinValue = Integer.MIN_VALUE;
		int myMaxValue = Integer.MAX_VALUE;
		
		System.out.println("Integer min value = " + myMinValue);
		System.out.println("Integer Max value = "+ myMaxValue);
		System.out.println("Busted Max value = " + (myMaxValue + 1));
		System.out.println("Busted Max value = "+ (myMinValue - 1));
		
		// short value
		
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		
		System.out.println("Short Min Value = " + myMinShortValue);
		System.out.println("Short Max value = " + myMaxShortValue);
		
		// Long value 
		long myLongValue = 100L;
		
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		
		System.out.println(" Long Min Value = " + myMinLongValue);
		System.out.println(" Long Max value = " + myMaxLongValue);

	}

}
