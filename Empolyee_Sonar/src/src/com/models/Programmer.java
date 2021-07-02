package src.com.models;

public class Programmer extends Employee {

	public Programmer()
	{
	 setSal("40000");
	 setDesig("Programmer");
	}
	
	public void raiseSalary()
	{
		setSal(getSal()+2000);
	}
}
