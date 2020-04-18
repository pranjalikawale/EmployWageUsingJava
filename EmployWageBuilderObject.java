import java.lang.*;
import java.util.*;

public class EmployWageBuilderObject
{
	//main method
   public static void main(String args[])
   {  //create instance of company
		ArrayList<CompanyEmpWage> companyArrayList=new ArrayList<CompanyEmpWage>();
 		companyArrayList.add(new CompanyEmpWage("TCS",15,15,100));
		companyArrayList.add(new CompanyEmpWage("Relance jio",20,20,100));
		
		//create instance of employWage
		EmployWageComputation employee=new EmployWageComputation();
      employee.computeEmployWage(companyArrayList);
   }
}
