package Exception;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word= {"xyxw","weer","rtte","rjrj"};
		try {
			//System.out.println(Integer.parseInt(word[1]));
		//	System.out.println(word[5]);
			System.out.println(word[4].charAt(5));
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (IndexOutOfBoundsException r) {
			System.out.println(r);
		}
//		catch (ArrayIndexOutOfBoundsException s) {
//			System.out.println(s);
//		}
		catch(Exception w) {
			System.out.println(w);
		}

	}

}
