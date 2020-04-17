import java.lang.*;

public class EmployWageComputation
{
   //constant
   final static int IS_FULL_TIME=1;
   final static int IS_PART_TIME=2;
   final static int EMP_RATE_HRS=20;
   final static int WORKING_DAY=20;
   final static int WORKING_HOURS=100;

   //return empHrs
   public int getHour(int attendence)
   {
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
      return (hrs*EMP_RATE_HRS);
   }


   public static void main(String args[])
   {
      //create instance
      EmployWageComputation employ= new EmployWageComputation();

      //variable
      int empHrs=0;
      int empWage=0;
      int empAttendence;
      int totalWorkingDay=0;
      int totalWorkingHrs=0;
      int size=25;
      int empDailyWage[]=new int[size];
      int hours;

      //find totalWorkingHrs
      while(totalWorkingHrs<WORKING_HOURS && totalWorkingDay<WORKING_DAY)
      {
         empAttendence=(int)(Math.random()*10)%3;
         hours=employ.getHour(empAttendence);
         totalWorkingHrs=totalWorkingHrs+hours;
         empDailyWage[totalWorkingDay++]=employ.getDailyWage(hours);
      }

      //calculate wages for per day
      for(int i=0;i<empDailyWage.length;i++)
      {
         System.out.println("Day "+(i+1)+" : "+empDailyWage[i]);
      }
      //calculate empwage
      System.out.println("Employ Wage for month : "+employ.getDailyWage(totalWorkingHrs));
   }
}


