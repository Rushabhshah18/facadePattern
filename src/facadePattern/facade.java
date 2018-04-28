package facadePattern;

public class facade implements Borrowing {
	
	borrowTheBook l=new borrowTheBook();
	ReturnCheck r=new ReturnCheck();
	CheckDueDate cdd = new CheckDueDate();

	@Override
	public void whichOn(String bookName , int action) {
		// TODO Auto-generated method stub
		switch (action) {
		case 1:
			//f.whichOn(bookName,action);
			//f.
			l.borrow(bookName);
			System.out.println("Borrowing the Book");
			break;
		case 2:
			//f.
			r.whichOn(bookName, action);
			System.out.println("Returning the Book");
			break;
		case 3:
			//f.
			cdd.whichOn(bookName, action);
			System.out.println("You will be notified of your due date in a while");
			break;

		default:
			break;
		}
	}
	
}
