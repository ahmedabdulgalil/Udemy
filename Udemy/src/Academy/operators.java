package Academy;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 1 + 2; // 1+3 = 3
		
		System.out.println( result);
		
		int previousResult = result;
		
		System.out.println(" previous Result " + previousResult);
		result = result - 1;
		
		System.out.println(" 3 - 1 =" + result);
		
		previousResult = previousResult;
		System.out.println(" previous Result " + previousResult);
		
		result = result * 10;
		
		System.out.println(" 2 * 10 = " + result);
		
		result = result / 5;
		
		System.out.println(" 20  / 5 =  " + result);
		
		result = result % 3;
		
		System.out.println(" 4 % 3 = " + result);
		
		result++;
		System.out.println(" result "+ result);

	}

}
