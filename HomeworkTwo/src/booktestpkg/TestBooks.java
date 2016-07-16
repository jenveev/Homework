package booktestpkg;
import bookpkg.Book;
import bookpkg.BookProcessor;
import exceptpkg.BookException;

public class TestBooks 
{
	public static void main(String[] args) 
	{
		//instantiating the class BookProcessor
		//instantiating the class Book and giving passing the pages, author, title. and id	
		BookProcessor bp = new BookProcessor();
		Book bk = new Book(300, "Jack London", "White Fang",25);
		Book bk2 = new Book(420, "Robert Ruark", "The Old Man and the Boy",2);
		Book bk555 = new Book(111, "Incredible Hulk", "Mythical Body Building",-34);
		Book bk3 = new Book(175, "Tony Nester", "Ancient PathWays",32);
		Book bk4 = new Book(1320, "Victor Hugo", "Les Misarables",1);
		//try and catch to catch an exception
		//try all these new variables of type Book
		try {
			bp.addBook(bk);
			bp.addBook(bk2);
			bp.addBook(bk3);
			bp.addBook(bk4);
			bp.addBook(bk555);
		
		//catch the Book Exception which is found in BookProcessor
		}catch(BookException bex){
			System.out.println("Book Exception:  "  + bex);
		}
		//System.out.println("\n\nSorting books with recursion.");
		//bp.sortBooksRecurse(0);
		
		System.out.println("\n\nSorting books without recursion.");
		bp.sortBooksNoRecurse();
		
		System.out.println("Book Report ***********\n");
		Book[] books = bp.getBooks();
		for (Book b: books) //casting with generics. Calling type Book 
			//loading the array called books
		{
			if(b != null) //if b does not equal null, print out the Title and Id
			System.out.println(b.getTitle() + "\t" + b.getId());
		}
	}
}


