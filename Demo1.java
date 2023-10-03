package Exception;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c=null;
		System.out.println("Hello world");
		try {
		String d=c.toUpperCase();
		}
		catch (NullPointerException t) {
		
		//System.out.println("Hello world");
		System.out.println(t);
		System.out.println("hi");
	}

}
}