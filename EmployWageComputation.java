import java.lang.*;

public class EmployWageComputation
{
   //constant
   final static int IS_FULL_TIME=1;
   final static int IS_PART_TIME=2;
	
	//class variables
	public int totalWages;

   //return empHrs
   public int getHour()
   {
		int attendence=(int)(Math.random()*10)%3;
      int empHrs=0;

      switch(attendence)
      {
         case IS_FULL_TIME:
            empHrs=8;
            break;
         case IS_PART_TIME:
            empHrs=4;
            break;
         default:
            empHrs=0;
            break;
      }
      return empHrs;
   }

   //return daily empWage
   public int getDailyWage(int hrs,int rate)
   {
      return (hrs*rate);
   }

	//compute employ wage
	public void computeEmployWage(CompanyEmpWage[] companies)
	{
		for(CompanyEmpWage company:companies)
		{
			int totalWorkingDay=0, totalWorkingHrs=0 , hours, employRate;
			employRate=company.getEmpRate();

			//find totalWorkingHrs
			while(totalWorkingHrs<company.getWorkingHrs() && totalWorkingDay<company.getWorkingDays())
      	{
				hours=getHour();
         	totalWorkingHrs=totalWorkingHrs+hours;
				System.out.println(company.getCompanyName()+" Employ Wage for day "+(++totalWorkingDay)+" : "+getDailyWage(hours,employRate));
      	}
		//calculate total wage
		totalWages=getDailyWage(totalWorkingHrs,employRate);
		System.out.println(company.getCompanyName()+" Total Employ Wage for month : "+ totalWages);
		System.out.println();
	}

}
}
