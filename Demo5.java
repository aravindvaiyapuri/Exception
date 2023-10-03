package Exception;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[ ] num = {99,76,87}; 
      System.out.println(num[2]);
      try {
      System.out.println(num[5]);
      }
      catch (ArrayIndexOutOfBoundsException e){
    	  System.out.println(e);
    	  
      }
      finally {
    	  System.out.println("this Array");
      }
}
}