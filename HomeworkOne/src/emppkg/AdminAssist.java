package emppkg;

public class AdminAssist extends Employee implements Payable 
{
	private int status; 
	//employee work half time or full time
	private static final double HALF_BASE=0.5; 
	//used to commute employee's salary
	//can't have get set methods for constants
	
	public AdminAssist () //default constructor
	{
		
		super(); //access to employee class
		status=Payable.PART_TIME; 
	//we set a constant to a different variable in the constructor
		
	}
	
	public AdminAssist(int id,String fname, String lname, String hireDate, 
				String pos, int stat) 
	//method overloaded
	{
	//assign the argument passed as "stat" to status.
	//to initialize the employee
	//passing parmameters for AdminAssist
	//all are from Employees,calling the method from Employees
		
		super.setEmpId(id); 
		super.setEmpFirstName(fname);
		super.setEmpLastName(lname);
		super.setEmpHireDate(hireDate);
		super.setEmpPosition(pos);
		status=stat;
			
	}
	
	public void computeSalary(double baseSalary)
	{
		if (status==FULL_TIME)
		//this comes from Payable interface
		{
		
			super.setEmpSalary(baseSalary);
		}
		
		else 
		{
		
			super.setEmpSalary(baseSalary*HALF_BASE);
		}
	}
	//creating a get set methods for a new variable called status
	public int getStatus()
	{
		return status;
	}

	public void setStatus(int stat)
	{
		status=stat;
	}
	
	public String toString()
	{
		return super.toString()+""+ getStatus(); 
		//super if the method is public
		//calling other methods in the Employee class and adding from this class
		////helps get the current state object b/c of debugging
	}	

	
}