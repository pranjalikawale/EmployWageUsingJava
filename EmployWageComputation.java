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
      double attendence=Math.floor(Math.random()*10)%3;
      //find empHr
      if(attendence == IS_FULL_TIME)
         empHrs=8;
      else if(attendence == IS_PART_TIME)
         empHrs=4;
      else
         empHrs=0;
      //calculate empwage
      System.out.println("Employ Wage:"+(empHrs*EMP_RATE_HRS));
   }
}

