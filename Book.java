public class Book implements Comparable <Book> {

	
	private String Author;
	private String Title;
	private int year;
	
	public Book(String Title, String Author, int year) {
		this.Title= Title;
		this.Author= Author;
		this.year= year;
	}
	
	public String getTitle() {
		return Title;		
	}
	
	public String getAuthor() {
		return Author;
	}
	
	public int getYear() {
		return year;
	}
	
	public String toString() {
		return Author +", "+ Title+ ", "+ year;
	}
	
	
	public int compareTo(Book other) {
		if (Title.equals(other.Title)) {
			return Author.compareTo(other.Author);
		}else if(Author.equals(other.Author)) {
			return year-other.year;
		}else if (year>other.year) {
		return -1;
		}else if (year<other.year) {
		return 1;
	
	}else {
		return toString().compareTo(other.toString()); 
	}
}}