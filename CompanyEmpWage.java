import java.lang.*;

public class CompanyEmpWage
{
	//variables
	String companyName;
	int empRate, workingDays, workingHrs;

	//constructor
	public CompanyEmpWage(String name,int rate,int days,int hrs)
	{
		this.companyName=name;
		this.empRate=rate;
		this.workingDays=days;
		this.workingHrs=hrs;
	}

	//return companyName
	public String getCompanyName()
	{
		return companyName;
	}

	//return empRate
	public int getEmpRate()
	{
		return empRate;
	} 

	//return workingDays
	public int getWorkingDays()
	{
		return workingDays;
	}

	//return workinghrs
	public int getWorkingHrs()
	{
		return workingHrs;
	}
}
