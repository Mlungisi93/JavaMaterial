package bookInheritance;

public class UseBookConstructor {

    public static void main(String[] args) {
        Book book = new Book("Book Title", 100);
        System.out.println("Book title = "+book.getTitle());
        System.out.println("Book pages = "+book.getPages());

        TextBook textBook = new TextBook("TextBook Title", 150, 8);
        System.out.println("\nTextBook grade level = "+textBook.getGradeLevel());
        System.out.println("TextBook title = "+textBook.getTitle());
        System.out.println("Book title = "+book.getTitle());
        System.out.println("Book pages = "+textBook.getPages());

        System.out.println("End of Demo!");
    }
}

class Book{

    private String title = "HardCodedTitle";
    private int pages;

    public Book(String title, int pages){
        setTitle(title);
        setPages(pages);
        System.out.println("Book constructor called.");
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getPages(){
        return pages;
    }

    public void setPages(int pages){
        this.pages = pages;
    }
}

class TextBook extends Book{

    private int gradeLevel = 10;

    public TextBook(String title, int pages, int gradeLevel){
        super(title, pages);
        setGradeLevel(gradeLevel);
        System.out.println("TextBook constructor called.");
    }

    public int getGradeLevel(){
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel){
        this.gradeLevel = gradeLevel;
    }
}
