import java.lang.*;

public class EmployWageBuilderObject
{
	//main method
   public static void main(String args[])
   {  //create instance of company
		CompanyEmpWage companyObject[]=new CompanyEmpWage[2];
 		companyObject[0]=new CompanyEmpWage("TCS",15,15,100);
		companyObject[1]=new CompanyEmpWage("Relance jio",20,20,100);
		
		//create instance of employWage
		EmployWageComputation employee=new EmployWageComputation();
      employee.computeEmployWage(companyObject);
   }
}
