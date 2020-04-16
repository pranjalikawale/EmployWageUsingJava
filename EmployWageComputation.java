import java.lang.*;

public class EmployWageComputation
{
   public static void main(String args[])
   {
      //constant
      final int IS_FULL_TIME=1;
      final int IS_PART_TIME=2;
      final int EMP_RATE_HRS=20;
      //variable
      int empHrs=0;
      int empWage=0;
      int attendence=(int)(Math.random()*10)%3;
      //find empHr
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
      //calculate empwage
      System.out.println("Employ Wage:"+(empHrs*EMP_RATE_HRS));
   }
}

