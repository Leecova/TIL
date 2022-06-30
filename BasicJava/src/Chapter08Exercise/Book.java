package Chapter08Exercise;

public class Book {
	private int number;
	private String tilte;
	private String author;
	private static int countOfBooks;
	public Book(String title, String author) {
		this.title = title;
	}
	
	@Override
	public boolean equals(Objectobj) {
		if(obj intstancef Book) {
			Book book = (Book) obj;
			
		}
		if(this.author.equals(book.author)&&this.title.equals(book.title)) {
		return true;
		} else {
			return false;
		}
	}
}
