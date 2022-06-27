import java.util.ArrayList;
import java.util.Collections;

public class BookClient{
public static void main(String[]args) {
	
	
	ArrayList<Book>books= new ArrayList<Book>();
		books.add(new Book("J.K Rowling", "Harry Potter",2001));
		books.add(new Book("Jalen Davis", "College Life",2018));
		books.add(new Book("George Johnson", "Game of Thrones",1998));
		books.add(new Book("R.L Stien", "Goosebumps",1996));
		books.add(new Book("Jalen Davis", "College Life",2019));
		
		
		System.out.println("Before sort");
		for(int i=0; i<books.size();i++) {
			System.out.println(books.get(i));
		}
		
		System.out.println();
		System.out.println("After sorting");
		for(int i=0; i<books.size();i++) {
			Collections.sort(books);
			System.out.println(books.get(i));
			
		}
		
		
}

}
