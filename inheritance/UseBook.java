package inheritance;

public class UseBook {
		
	public static void main(String[] args) {
		Book book = new Book();
		System.out.println("Book title = "+book.getTitle());
		//System.out.println("Book grade level = "+book.getGradeLevel()); can nor resolve


		TextBook textBook = new TextBook();
	book = textBook;
		//System.out.println("Book grade level = "+book.getGradeLevel()); it would not allow
		System.out.println("\nTextBook grade level = "+textBook.getGradeLevel());
		System.out.println("TextBook title = "+textBook.getTitle());

		System.out.println("Book!");
		}
}

class Book{

	private String title = "HardCodedTitle";
	private int pages;
	
	public String getTitle(){
		return title;
	}
	
}

class TextBook extends Book{

	private int gradeLevel = 10;
	
	public int getGradeLevel(){
		return gradeLevel;
	}
}