package Exception;

public class MaxValue {
	public String  findmax (int[] a) throws OddEven {
	       int max=a[0];
	       for(int i=0;i<a.length;i++) {
	      	 if(a[i] >max) {
	      		 max=a[i];
	      		 
	   }
	}
	       if(max%2==0) {
	    	    return "even";
	       }else {
	    	    throw new OddEven("");
	       }

}
}
class OddEven extends Exception {
	public OddEven(String a) {
		super(a);
}
}