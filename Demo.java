package Exception;

public class Demo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a=15;
		int b=0;
		try {
		System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("this is invalid data");
		}
		
	}

}
