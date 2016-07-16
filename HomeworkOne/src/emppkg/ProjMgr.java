package emppkg;

public class ProjMgr extends Employee implements Payable 
{
	public static final int HOURLY_CONV=2080;
	private boolean consultant;
	
	
	public ProjMgr () //default constructor
	{
		super();
		consultant=false;
			
	}
	
	public ProjMgr(int id,String fname,String lname,String hireDate,
				String pos,boolean cons) 
	//method overloaded
	{
	//assign the argument passed as "cons" to consultant.Use rest of the arguments
	//to initialize the employee
	//passing parameters for AdminAssist
	//all are from Employees,calling the method from Employees
		
		super.setEmpId(id); 
		super.setEmpFirstName(fname);
		super.setEmpLastName(lname);
		super.setEmpHireDate(hireDate);
		super.setEmpPosition(pos);
		consultant=cons;	
	}
	
	public void computeSalary(double baseSalary) 
	{
		if (consultant=ifConsultant()) 
//Calling the method ifConstant because in ProjMgr it returns the Consultant salary
		{
			super.setEmpSalary(baseSalary/HOURLY_CONV);
		}
		else //just calculate the ProjMgr salary
		{
			super.setEmpSalary(baseSalary);
		}
	}
	
	public boolean ifConsultant()
	{
	//if ProjMgr is a consultant it will return consultant
	
		return consultant;
	}
	
	
	public String toString()
	{
		return super.toString(); //super if the method is public
//not adding another variables because I did not create any get or set methods
	}	

	
}