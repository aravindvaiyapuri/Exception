package Exception;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String a="Bala";
         try {
         char b=a.charAt(5);
         System.out.println(b);
         }
         catch(StringIndexOutOfBoundsException q) {
        	 System.out.println(q);
         }
         try {
         char[] c=a.toCharArray();
         System.out.println(c[5]);
         }
         catch(ArrayIndexOutOfBoundsException q) {
        	 System.out.println(q);
         }
        
	}

}
