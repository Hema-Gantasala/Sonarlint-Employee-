package src.com.models;


public class Clerk extends Employee  
	{
	public Clerk()
	{
	  setSal("30000");
	  setDesig("Clerk");
	}
	public void raiseSalary()
	{
		setSal(getSal()+1500);
	}

		
	}

