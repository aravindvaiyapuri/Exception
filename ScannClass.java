package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the age");
		try {
		int age=scan.nextInt();
		System.out.println("your age is "+age);
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
	}

}
