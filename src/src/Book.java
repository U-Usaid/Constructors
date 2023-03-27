package src;

public class Book {

	String book;
	String Author;
	int year;
	
	
	Book(String bookTitle, String bookAuthor, int publicationYear){
		this.book = bookTitle;
		this.Author = bookAuthor;
		this.year = publicationYear;
		
	}
	
	public String getTitle(){
		return book;
	}
	
	public String getAuthor() {
		return Author;
	}
	
	public int getPublicationYear() {
		return year;
	}
	
}
