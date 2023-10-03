package Exception;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="1b";
		try {
		int b=Integer.parseInt(a);
		}
		catch (NumberFormatException c){
			 System.out.println(c);
		}
		System.out.println(a);

	}

}
