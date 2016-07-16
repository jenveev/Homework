/*
 * the package is called exceptpkg
 *This class is a custom exception class and its developed as a checked exception. 
 *when extending exception it automatically becomes a checked exception
 *checked exception is checked by compiler
 *the variable bk is type Book, so that is why we need to import bookpkg.Book
 *will be an error if bookpkg is not imported
 *toString method helps get the current state object b/c of debugging
 */

package exceptpkg;

import bookpkg.Book;

public class BookException extends Exception 
{
	private Book bk; 

	public BookException(Book b) 
	{
		bk=b;
	}
	
	public Book getBook() 
	{
		
		return bk;
	}
	
	public String toString() //helps get the current state object b/c of debugging
	{
		return bk.toString();
	}

}
