import java.lang.*;
import java.util.*;

public class EmployWageComputation
{
   //constant
   final static int IS_FULL_TIME=1;
   final static int IS_PART_TIME=2;
   //Declarethe Map to store company and its Wages[daily & total]
    Map <String,CompanyWagesClass> CompanyandWaagesMap=new HashMap<String,CompanyWagesClass>();
 
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
   public void computeEmployWage(ArrayList<CompanyEmpWage> companyDetailsList)    
   {
	//Iterate through all the companies and compute daily and TotalWages
      for(CompanyEmpWage company : companyDetailsList)
      {
         int totalWorkingDay=0, totalWorkingHrs=0 , hours, employRate;
			
			CompanyWagesClass compWages=new CompanyWagesClass();//For Each Company it get declared
         employRate=company.getEmpRate();

         //Compute daily wages for company and store in CompanyWagesClass object
         while(totalWorkingHrs<company.getWorkingHrs() && totalWorkingDay<company.getWorkingDays())
         {
            hours=getHour();
            totalWorkingHrs=totalWorkingHrs+hours;
	     		compWages.dailwageArrayList.add(getDailyWage(hours,employRate));
         }

         //calculate total wage for the compan and store in CompanyWagesClass object
			compWages.totalWages=getDailyWage(totalWorkingHrs,employRate);

			//Finally store company name and it respective Wages in Map.
			CompanyandWaagesMap.put(company.getCompanyName(),compWages);
     	 }
		 displayWages();
    }

	//Display Comany Wages
	public void displayWages()
	{
		for(Map.Entry<String,CompanyWagesClass> cmp : CompanyandWaagesMap.entrySet())
		{
			System.out.println("Company :"+cmp.getKey() +" \nCompany Daily Wages :"+cmp.getValue().dailwageArrayList +"\n Company Total Wages : "+cmp.getValue().totalWages);
		}
	}

	//make class for wages
	private class CompanyWagesClass
	{
   	private int totalWages;
   	private ArrayList<Integer> dailwageArrayList = new ArrayList<Integer>();
	}
}






