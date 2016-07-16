/*
 *This interface is called Processable and it has a seperate package called ifacepkg
 *imported the bookpkg because these methods here are used in Book Processor class
 *this iterface is imported in the Book Processor class
 *interfce could extend another interface but can't extend another class
 *abstract methods, NOT implemented 
 */

package ifacepkg;
import bookpkg.Book;
import exceptpkg.BookException;

public interface Procesable 
{
		public void addBook(Book bk) throws BookException;
		public void sortBooksRecurse(int startIndex);
		public void sortBooksNoRecurse();
		
}
