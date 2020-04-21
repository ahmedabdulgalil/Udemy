package Academy;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte , short , int , long , float , double , char , boolean 
		
		
		String myString = " this is a string";
		
		System.out.println(" My string is  equal to " + myString);
		
		myString = myString + ", and this is more.";  // take the value of myString and all the new string to it
		System.out.println(" My string is equal to" + myString);
		
		myString = myString + "\u00A9 2019";
		
		System.out.println(" This String is equal to " + myString);
		
		String numberString = "250.55";
		numberString = numberString + "49.95";  // because it is a string number, it wont treated at number
		System.out.println(numberString);
		
		String lastString = "10";
		int myInt = 50; // even though you this line is an Int type, next line still treated at a string type 
		lastString = lastString + myInt;
		System.out.println(" LastString is eqaul to " +lastString);
		
		
		
		
		

	}

}
