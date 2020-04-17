import java.lang.*;

public class EmployWageBuilderObject
{
	//main method
   public static void main(String args[])
   {  //create instance
      EmployWageComputation jio= new EmployWageComputation("Relance jio",20,20,100);
      EmployWageComputation tcs= new EmployWageComputation("TCS",15,15,100);
      jio.computeEmployWage();
      tcs.computeEmployWage();
		jio.totalEmployWage();
		tcs.totalEmployWage();
   }
}
