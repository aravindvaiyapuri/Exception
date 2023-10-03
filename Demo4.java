package Exception;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="Bala";
        char b=a.charAt(0);
        System.out.println(b);
        try {
        char r=a.charAt(5);
        }
       catch(IndexOutOfBoundsException q) {
       	System.out.println(q);
        }
        finally {
        	System.out.println("this String");
       
	}

}
}