import java.lang.*;

public class EmployWageComputation
{
   //constant
   final static int IS_FULL_TIME=1;
   final static int IS_PART_TIME=2;
	
	//class variables
	int empRate, numberOfDays, numberOfHrs;

	//constructor
	public EmployWageComputation(int rate,int days,int hrs)
	{
		this.empRate=rate;
		this.numberOfDays=days;
		this.numberOfHrs=hrs;
	}
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
   public int getDailyWage(int hrs)
   {
      return (hrs*empRate);
   }

	//compute employ wage
	public void computeEmployWage()
	{
		int totalWorkingDay=0, totalWorkingHrs=0 , hours;
      //find totalWorkingHrs

		while(totalWorkingHrs<numberOfHrs && totalWorkingDay<numberOfDays)
      {
			hours=getHour();
         totalWorkingHrs=totalWorkingHrs+hours;
			System.out.println("Employ Wage for day "+(++totalWorkingDay)+" : "+getDailyWage(hours));
      }

		//calculate empwage
      System.out.println("Employ Wage for month : "+getDailyWage(totalWorkingHrs));

	}

	//main method
   public static void main(String args[])
   {  //create instance
      EmployWageComputation employ= new EmployWageComputation(20,20,100);
		employ.computeEmployWage();
   }
}


