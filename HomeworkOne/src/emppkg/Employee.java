//Employee salary reporting application. 
//This is the base class for all employee-type classes

package emppkg; // used for all subclasses that extend Employee

public class Employee //instance variables,generalized
{
	private int empId;
	private String empFirstName;
	private String empLastName;
	private double empSalary;
	private String empHireDate;
	private String empPosition;
	
	public Employee() //default constructor 
	{
		empId=0;//initialized in order to be explicit
		empFirstName=null;
		empLastName=null;
	  	empSalary=0.0;
		empHireDate=null;
		empPosition=null;
	}	
	
	public Employee(int id, String fname, String lname, String hireDate,String pos)
	{
		//assign arguments passed to instance variables
		id=empId;
		empFirstName=fname;
		empLastName=lname;
		empHireDate=hireDate;
		empPosition=pos;
		//method overloading
	}
	//get and set methods to create objects and to be able to use in different classes
	
	public int getEmpId()
	{
		return empId;	
	}
	
	public String getEmpFirstName() 
	{
		return empFirstName;
	}
	
	public String getEmpLastName()
	{
		return empLastName;
	}
	
	public double getEmpSalary()
	{
		return empSalary;
	}
	
	public  String getEmpHireDate()
	{
		return empHireDate;
	}
	
	public String getEmpPosition()
	{
		return empPosition;
	}
	
	public void setEmpId(int id)
	{
   		empId=id;
   	}
	
	public void setEmpFirstName(String fname)
	{
		empFirstName=fname;
	}
	
	public void setEmpLastName(String lname)
	{
		empLastName=lname;
	}
	
	protected void setEmpSalary(double wage) 
	//access as long in same package and to put restriction
	{
		empSalary=wage;
	}
	
	public void setEmpHireDate(String hdate)
	{
		empHireDate=hdate;
	}
	
	public void setEmpPosition(String level)
	{
		empPosition=level;
	}
	
	public String toString() //helps get the current state object b/c of debugging
	{
		return getEmpId() +""+ getEmpFirstName() +""+ getEmpLastName() 
		+""+ getEmpSalary() +""+ getEmpHireDate() +""+ getEmpPosition();
	}
}	