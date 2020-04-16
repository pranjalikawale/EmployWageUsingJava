import java.lang.*;

public class EmployWageComputation
{
	public static void main(String args[])
	{
		final int IS_FULL_TIME=1;
		final int EMP_RATE_HRS=20;
		int empHrs=0;
		int empWage=0;
		double attendence=Math.floor(Math.random()*10)%2;

		if(attendence == IS_FULL_TIME)
			empHrs=8;
		
		empWage=empHrs*EMP_RATE_HRS;
		System.out.println("Employ Wage:"+empWage);
	}
}
