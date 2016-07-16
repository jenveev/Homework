package emppkg;
//This interface has all the constant variables 
//that is used to calculate the salaries
//abstract methods
public interface Payable {
   double SAL_FACTOR_1 = 1.0;
   double SAL_FACTOR_2 = 1.2;
   int PART_TIME = 0;
   int FULL_TIME = 1;
   boolean CONSULTANT = true;
   void computeSalary(double baseSalary);

}
