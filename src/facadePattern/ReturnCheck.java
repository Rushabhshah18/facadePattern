package facadePattern;

public class ReturnCheck implements Borrowing {
	public void returningTheBook(){
		System.out.println("Thank you for returning the book... ");
	}

	@Override
	public void whichOn(String bookName, int action) {
		// Implementing methods
		returningTheBook();
		
	}
}
