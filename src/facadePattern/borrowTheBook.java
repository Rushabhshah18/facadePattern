package facadePattern;

public class borrowTheBook {
	static int i=1;
	static boolean bean = false;

	public void visitTheBookStore() {
		System.out.println("Visiting the bookstore");
	}

	public void lookingForTheBook() {
		System.out.println("Your Request has been register please wait for a while");
	}

	public void checkingIfSomeoneElseBorrowedIt(Boolean bean){
		if(bean){
		System.out.println("Sorry Someone Else took it");
		}else{
			System.out.println("Yeah!!.. your book is ready");
		}
	}
	
	public void issuingTheBook(){
		System.out.println("Book is yours now please return it in 30 days");
	}
	public void borrow(String bookName){
		//Calling the Methods to perform borrowing
		visitTheBookStore();
		lookingForTheBook();
		if(i%2==0){
			bean=true;
			i++;
		}
		checkingIfSomeoneElseBorrowedIt(bean);
		if(bean){
			System.out.println("Thank you for waiting Here is you book:"+bookName);
		}
	}

	public static int getI() {
		return i;
	}

	public static boolean isBean() {
		return bean;
	}
	
	
	
}
