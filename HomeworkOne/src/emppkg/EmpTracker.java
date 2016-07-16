package emppkg;
import java.util.*;

public class EmpTracker
{
		private ArrayList emps; 
		
	public EmpTracker()
	{	
		emps= new ArrayList(); //creating my arraylist
		
	}
	
	public void addEmployee(Payable emp)
	{
		emps.add(emp); //loading my arraylist
	
	}
	
	public void reportITEngs() 
	{
		for (Object obj: emps)
		{  
		   if (obj instanceof ITEngineer) //casting
		   {
			ITEngineer e = (ITEngineer) obj; //instantiating 
			System.out.println(e.getEmpFirstName()+ " " +e.getEmpLastName()
			+"\t\t\t"+e.getEmpPosition()+"\t\t\t"+e.getEmpSalary());	
		   }
		}
	}
	
	public void reportAdminAssist()
	{
		for (Object obj: emps)
		{  
		   if (obj instanceof AdminAssist)
		   {
				AdminAssist ee = (AdminAssist) obj;
				System.out.println(ee.getEmpFirstName()+ " " + ee.getEmpLastName()+
				"\t\t\t"+ee.getEmpPosition()+"\t\t\t"+ee.getEmpSalary());		
		   }
		}
	}
	
	public void reportProjMgr()
	{
		for (Object obj: emps)
		{  
		   if (obj instanceof ProjMgr)//print one for Consultant and ProjMgr
		   {
				ProjMgr m = (ProjMgr) obj;
				if (m.ifConsultant())
				{
					System.out.println(m.getEmpFirstName() + " " + m.getEmpLastName()+
					"\t\t\t"+ m.getEmpPosition()+"\t\t\t"+m.getEmpSalary()+"/hr");
				}
				else
				{
					System.out.println(m.getEmpFirstName()+ " " + m.getEmpLastName()+
					"\t\t\t"+m.getEmpPosition()+"\t\t\t"+ m.getEmpSalary());	
		   		}
		   }
		   
		}
	}
}	
	
