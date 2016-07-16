package emptestpkg; //new package to test
import emppkg.*; //importing package used in Employee and subclasses
public class EmpTester {
   public static void main(String[] args){
	EmpTracker et = new EmpTracker(); //instantiating
	ITEngineer ite = new ITEngineer(22, "Jim", "Burnworth", "2014-01-22",
			   "IT Engineer IV", ITEngineer.LEVEL2);
	   ite.computeSalary(120000);
	   et.addEmployee(ite);
	   ite = new ITEngineer(23, "Tiffany", "Lakosky", "2014-01-23",
			   "IT Engineer I", ITEngineer.LEVEL1);
	   ite.computeSalary(98000);
	   et.addEmployee(ite);

	   AdminAssist aa = new AdminAssist(50, "Lady", "Luck", "2012-02-22",
			   "Admin Asst V", Payable.FULL_TIME);
	   aa.computeSalary(80000);
	   et.addEmployee(aa);
	   
	   aa = new AdminAssist(50, "Peter", "Pan", "2002-07-28",
			   "Admin Asst II", Payable.PART_TIME);
	   aa.computeSalary(20000);
	   et.addEmployee(aa);
	   
	   ProjMgr pmgr = new ProjMgr(80, "Daddy", "Longlegs", "2011-03-28",
			   "C-Proj Mgr II", Payable.CONSULTANT);
	   pmgr.computeSalary(140000);
	   et.addEmployee(pmgr);
	   
	   pmgr = new ProjMgr(80, "Mommy", "Shortlegs", "2009-08-15",
			   "Proj Mgr III", false);
	   pmgr.computeSalary(150300);
	   et.addEmployee(pmgr);
	   
	   System.out.println("Employee name" + "\t\t\t" + "Position" + "\t\t\t" + "Salary");
	   System.out.println("\n");
	   et.reportAdminAssist();
	   et.reportITEngs();
	   et.reportProjMgr();
   }
}
