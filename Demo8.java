package Exception;

public class Demo8 {

	public static void main(String[] args)throws VoteNotEligible {
		// TODO Auto-generated method stub
		int a=17;
		if(a>=18) {
			System.out.println("is eligible");
		}
		else {
			throw new VoteNotEligible("");
		}

	}

}
