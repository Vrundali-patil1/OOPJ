package acts.in;

public class operations {
	public static void main(String[] args) {
		int intValue = 5;
		double doubleValue = 20.2;
		float floatValue = 2.5f;
		
		double result1 = intValue + doubleValue;
		double result2 = floatValue + doubleValue;
		float result3 = floatValue * intValue;
		double result4 = doubleValue / floatValue;
		double result5 =  doubleValue / intValue;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
	}

}
