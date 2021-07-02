package src.com.models;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.logging.Logger;




public class Employee extends Object implements Comparable<Employee> {
	
	
       Logger logger=Logger.getLogger(getName());
		private String name;
		private String age;
		private String sal;
		private String desig;
		private String emailId;
		private int id;
		private int deptno;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	

		public Employee() {
			logger.info("Default Constructor");
	      }

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getSal() {
			return sal;
		}
		public void setSal(String sal) {
			this.sal = sal;
		}
		public String getDesig() {
			return desig;
		}
		public void setDesig(String desig) {
			this.desig = desig;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getDeptno() {
			return deptno;
		}
		public void setDeptno(int deptno) {
			this.deptno = deptno;
		}
		
		@Override
		public int hashCode() 
		{
			return id;
		}

		@Override
		public String toString() {
			return "\nName: "+this.name +"\nEmailId: "+ this.emailId +"\nAge: "+this.age+ " \nSalary: "+this.sal+ " \nDesignation:"
					+this.desig + " \nDepartmentNo: "+ this.deptno;
		}
		
		@Override
		public boolean equals(Object obj)throws NullPointerException
		{
	
			String e1 = ((Employee) obj).getEmailId();
			String e2 = this.emailId;
			
			return  e1.equals(e2);
			
		}

		@Override
		public int compareTo(Employee e) 
		{
	        Employee u1 = e;
			
			String e1 = u1.getEmailId();
			String e2 = this.emailId;	
			
			return e1.compareTo(e2);
		}
		public void insert()
		{
			try
			{
			logger.info("Enter Name");
	        setName(br.readLine());

	        logger.info("Enter age");
	        setAge(br.readLine());

	        logger.info("Enter DepartmentNo");
	        setDeptno(Integer.parseInt(br.readLine()));

	        logger.info("Enter Email id");
	        setEmailId(br.readLine());
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

		}
		
		
	}


