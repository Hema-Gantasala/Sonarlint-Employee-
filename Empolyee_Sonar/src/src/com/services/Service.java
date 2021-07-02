package src.com.services;

	import java.util.HashMap;
	import java.util.List;
	import java.util.Set;
import java.util.logging.Logger;

import src.com.dao.MySqlImpl;
import src.com.models.Employee;

import java.io.IOException;
	import java.sql.SQLException;

	public class Service 
	{
	     private MySqlImpl ms=new MySqlImpl();
	     Logger logger=Logger.getLogger(null);
	     
	     public void create(Employee e) throws SQLException, IOException
	     {
	    	ms.initDB();
	    	 
	    	 int count=ms.create(e);
	    	 
	    	 if(count>0)
	    	 {
	    		 logger.info("Employee is inserted");   		 
	    	 }
	    	 else
	    	 {
	    		 logger.info("error while inserting employee details");
	    	 }
		    ms.closeDB();
	    	 
	     }
	     
	     public void update(Employee e) throws SQLException,IOException 
	     {
	        
	    	 ms.initDB();
	    	  int count=ms.update(e);
	    	  
	    	  if(count>0)
	    	  {
	    		  logger.info("Employee details are updated");
	    	  }
	    	  else
	    	  {
	    		  logger.info("error while updating details");
	    	  }
	    	  ms.closeDB();
	    	 
	     }
	     
	     public void deleteByEmail(String emailId) throws SQLException, IOException 
	     {
	    	 ms.initDB();
	    	  int count=ms.deleteByEmail(emailId);
	    	  
	    	  if(count>0)
	    	  {
	    		  logger.info("employee details got deleted");
	    	  }
	    	  else
	    	  {
	    		  logger.info("error while deleting");
	    	  }
	    	 ms.closeDB();
	     }
	     
	     public void deleteById(int id) throws SQLException, IOException 
	     {
	    	 ms.initDB();
	    	  int count=ms.deleteById(id);
	    	  
	    	  if(count>0)
	    	  {
	    		 logger.info("employee details got deleted");
	    	  }
	    	  else
	    	  {
	    		  logger.info("error while deleting");
	    	  }
	    	 ms.closeDB();
	     }
	     
	     public Employee getEmployeeByEmail(String emailId) throws SQLException,IOException
	     {
	    	 ms.initDB();
	    	 
	    	 var e1= ms.getEmployeeByEmail(emailId);
	    	 ms.closeDB();
	    	 return e1;
	    	 
	    	 
	     }
	     
	     public List<Employee> getAllEmployees() throws SQLException,IOException
	     {
	    	 ms.initDB();
	    	 
	    	 List<Employee> employeeList=ms.getAllEmployees();
	    	 
	    	 ms.closeDB();
	    	 return employeeList;
	    	 
	     }
	     
	     public Set<Employee> getAllEmployeesSortByEmailId() throws SQLException,IOException
	     {
	    	 ms.initDB();
	    	 
	    	 Set<Employee> employeeSet=ms.getAllEmployeesSortByEmailId();
	    	
	    	 
	    	 ms.closeDB();
	    	 return employeeSet;
	     }
	     
	     
	     
	    public void searchEmployee(String email) throws SQLException, IOException
	    {
	    	HashMap<String,Employee> employeeTable=(HashMap<String, Employee>) ms.getEmployeeTable();
	    	var e1=employeeTable.get(email);
	    	if(e1!=null)
	    	{
	    		logger.info(" employee found");
	    		logger.entering(null,null,e1);
	    		
	    	}
	    	else
	    	{
	    		ms.initDB();
	    		
	    		var e2=ms.getEmployeeByEmail(email);
	    		ms.closeDB();
	    		
	    		if(e2!=null)
	    		{
	    			logger.info("employee found");
	    			logger.entering(null,null,e2);
	    		}
	    		else
	    		{
	    			logger.info("employee not found");
	    		}
	    	}
	    }
	    
	  public void exit() throws SQLException
	  {
		  ms.closeDB();
	  }
	     
	}

	

