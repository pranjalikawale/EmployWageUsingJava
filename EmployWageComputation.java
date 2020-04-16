import java.lang.*;

public class EmployWageComputation
{
   public static void main(String args[])
   {
      int IS_FULL_TIME=1;
      double attendence=Math.floor(Math.random()*10)%2;

      if(attendence == IS_FULL_TIME)
         System.out.println("Employee is Present");
      else
         System.out.println("Employee is Absent");
   }
}
