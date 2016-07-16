package emppkg;

public class ITEngineer extends Employee implements Payable 
//Payable is the interface
{
	public static final int LEVEL1=1; 
	//constant variables made =1 =2 to initialize  
	public static final int LEVEL2=2;
	private int gradeLevel; //new variable for this class
	
	public ITEngineer () //default constructor
	{
		//assign Level 1 to grade level in this constructor
		
		super(); //access to employee class
		gradeLevel=LEVEL1; 
		
	}
	
	public ITEngineer(int id,String fname, String lname, 
		String hireDate, String pos, int level)
	{
//This method is overloaded- same name but there is parameters.
//Assign the argument passed as "level" to gradeLevel 
//because gradeLevel is assigned however 
//there are multiple employees with different salaries
//Passing parmameters for ITEngineer all are from Employee
//calling the method from Employee
		
		super.setEmpId(id); 
		super.setEmpFirstName(fname);
		super.setEmpLastName(lname);
		super.setEmpHireDate(hireDate);
		super.setEmpPosition(pos);
		gradeLevel=level;
		
//i don't need to say super.set because this class inherits from Employee, 
//but I do this to help myself understand the concept and to not forget 
//i do this through out my whole code
			
	}
	
	public void computeSalary(double baseSalary) 
	//implementing the interface Payable
	{
//this method comes from Payable interface and
// this interface has the wages already 
//set to a particular number.
		
		if(gradeLevel==1)//this is the salary for the level1 ITEngineer
		{
			super.setEmpSalary(baseSalary*Payable.SAL_FACTOR_1);
		}
		//sal_factor_1 and sal_factor_2 have different numbers in Payable
		else if (gradeLevel==2)
		//this is the salary for the level2 ITEngineer
		{
			super.setEmpSalary(baseSalary*Payable.SAL_FACTOR_2);
				
		}
		//in Payable interface all variables are set to constants-final
	}
	
//creating get set method for gradelevel b/c its a new variable in this class
	
	public int getGradeLevel()
	{
		return gradeLevel;
	}

	public void setGradeLevel(int level)
	{
		gradeLevel=level;
	}
	
	public String toString()
	{
		return super.toString()+""+ getGradeLevel(); 
		//super if the method is public
		////helps get the current state object b/c of debugging
//calling other variables already called in Employee class plus the new variable
	}	
}