package Exception;

public class Demo9 {

	public static void main(String[] args)throws RetirementAge {
		// TODO Auto-generated method stub
		int a=56;
		try {
		if(a>=58) {
			System.out.println("is retirement age");
		}
		else {
			throw new RetirementAge("");
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
