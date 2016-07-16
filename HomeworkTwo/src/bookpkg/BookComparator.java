/*
 *This is a generic class and its purpose is to compare the id of the books
 *<T extends Book> T stands for the type, which means:
 *any class that extends Book
 *the first method has the T because that is the type
 *now we will compare obj of the first id with the second and return
 *if the first obj is greater we will return a positive number
 *if the first obj is less than we will return a negative number
 *if both equal, we will return zero. 
 *
 */

package bookpkg;

public class BookComparator<T extends Book>
{
	public int compare(T obj1, T obj2)
	{
		if (obj1.getId() > obj2.getId())
		{
			return 1;
		}

		else if  (obj1.getId() < obj2.getId())
		{
			return -1;
		}

		return 0;
	}
}