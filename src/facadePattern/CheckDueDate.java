package facadePattern;

public class CheckDueDate implements Borrowing{
	public void datesRemaining(){
		System.out.println("I guess its the day you submit it...");
	}
	@Override
	public void whichOn(String bookName, int action) {
		// Implementing the method for due date
		datesRemaining();
	}

}
