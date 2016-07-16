/*
 *This is the first class in the bookpkg.
 *This class has all the variables and the get and set methods
 *get and set methods are used to create objects to be used in diff classes
 *variable title is called and in the constructor the parameter calls title too
 *i can't make title=title, then i get nothing, adding this. refers to the variable
 *this.title is the variable and it is pointing to the title in the parameter
 *get and set methods helps me control the code when its a public class
 *toString method and I am passing id and title, because I want to debugged
 */


package bookpkg;

public class Book
{
	private int numPages;
	private String author;
	private String title;
	private int id;
	
	public Book (int pages, String auth, String title, int bookId)
	{
		numPages=pages;
		author=auth;
		this.title=title;
		id=bookId;
		
	}
	
	public int getnumPages()
	{
		return numPages;
	}
	public String getAuthor()
	{
		return author; 
	}
	public String getTitle()
	{
		return this.title;
		
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setnumPages(int pages)
	{
		numPages = pages;
	}
	
	public void setAuthor(String auth)
	{
		author=auth;
	}
	public void setTitle(String title1)
	{
		title=title1;
	}
	public void setId(int bookId)
	{
		id=bookId;
	}
	
	public String toString() //helps get the current state object b/c of debugging
	{
		return getTitle()+" "+getId();
	}
	
}
		
		