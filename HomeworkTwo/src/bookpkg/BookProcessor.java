/*
 *Because this class has many methods I will split up my comments
 *this class will process my arraylists
 *this package is bookpkg and will import java.util to use arrays
 *import the other packages because they will be used
 */
package bookpkg;
import java.util.*;

import exceptpkg.BookException;
import bookpkg.BookProcessor;
import ifacepkg.Procesable;

public class BookProcessor
{
	private Book [] books;
	private int numBooks=0;
	private BookComparator<Book> bc;
	/*
	 *I am creating my array which is a type Book
	 *numBooks is set to zero, will help me keep count of my books
	 *call BookComparator, b/c its generic class I will call just the type Book
	 */
	public BookProcessor()
	{
		books= new Book [10];
		bc=new BookComparator<Book>();
		/*
		 *constructor- the array will have 10 slots
		 *instantiating BookComparator
		 */
	}
	public void addBook(Book bk) throws BookException
	{
		if(bk.getId() < 0) {
			throw new BookException(bk);
		}
		
		if(numBooks >= 10)
		{
			throw new BookException(bk);
        }
		
		books[numBooks] = bk;
            numBooks++;
       /*
        *this method is from the interface
        *loading my array- first if id<0 then I will throw the exception
        *if its more than my array of 10 it will throw an exception
        *if it passes these inspections array called books will pass numBooks
        *every time numBooks is passed it will keep count of the total books        
       */
	}
	
	public void sortBooksRecurse(int startIndex)
	{
		/*
		 *Recursion means calling the method itself
		 *base case is needed to exist a recursive method
		 *without a base case there will be infinite loops
		 *startIndex is the first index of the array
		 */
		if ( startIndex >= numBooks - 1 ) 
		{
			return;
			//if the first index of the array is greater or equal to numbooks-1
			//we return nothing
			//ex: if array is {1,2,3,4,5} the startIndex=0
			//if 0 is bigger than numbooks, say numbook=0
			//so 0>=-1 is a true statement
		}
		
		int indexWithMinValue=startIndex;
		//the index with minimum value will be the next starting index
		//ex: in the array 
			
		for(int forwardIndex=startIndex+1; forwardIndex<numBooks;forwardIndex++) 
		{
			if(bc.compare(books[indexWithMinValue], books[forwardIndex]) > 0) 
			{
				//comparing the minimum value with the next element in array
				//make sure that it is greater than zero
				//if the staement is true the min value equals the next index
				indexWithMinValue = forwardIndex;
			}
		}	
		Book temp= books[startIndex];//swapping to check each element of array
		books[startIndex]=books[indexWithMinValue];//swap until last element
		books[indexWithMinValue]= temp;
		sortBooksRecurse(startIndex+1); //calling the same method=recursion
	} 
	
	public Book[] getBooks() //method to get books in the array-Book is the array type
	{
		return books;
	}
	
	public void sortBooksNoRecurse() //no parameters are being passed
	{
		int startIndex;
		Book temp; //type Book

		for(startIndex=0; startIndex<numBooks-1;startIndex++)
		{

			int minValue=startIndex;
			
			for(int forwardIndex=startIndex+1; forwardIndex<numBooks;forwardIndex++ ) 
			{

				if(bc.compare(books[minValue], books[forwardIndex]) > 0) 
				{
					//comparing the small value to the next index
					minValue = forwardIndex;

				}
			}
			temp=books[minValue];
			books[minValue]=books[startIndex];
			books[startIndex]=temp;
			//swapping I don't call the method again because I only do this is recursive method
		}
	}
}







