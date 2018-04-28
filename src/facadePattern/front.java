package facadePattern;

import java.util.Scanner;

//Front for the library Management SYstem
public class front {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to CSUDH Libray.");
		System.out.println("Are you new Member?(Y/N)");
		String c=sc.next();
		String bookName;
		int action ;
		if(c.toUpperCase().contains("Y")){
			System.out.println("In which book you are interested in?");
			bookName=sc.next();
			action=1;
		}else{
		System.out.println("Please Select the Action from the list:");
		System.out.println("1)Borrow Book \n2)Return The Book\n3) Check The due date");
		System.out.println("Press 0 to exit");
		action=sc.nextInt();
		System.out.println("Enter the name of book:");
		bookName=sc.next();
		}
		facade f=new facade();
		f.whichOn(bookName, action);
		sc.close();
	}
}
