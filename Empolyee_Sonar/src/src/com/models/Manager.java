package src.com.models;

public class Manager extends Employee {
	public Manager()
	{
	 setSal("90000");
	 setDesig("Manager");	
	}
	
	public void raiseSalary()
	{
		setSal(getSal()+1000);
	}
	
}
