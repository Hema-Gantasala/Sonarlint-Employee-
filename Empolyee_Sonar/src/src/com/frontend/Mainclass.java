package src.com.frontend;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

import src.com.models.*;

import src.com.services.Service;

public class Mainclass 
{
	
	public static void main(String[]args)
	{
       var s=new Service();
       var sc=new Scanner(System.in);
       var logger=Logger.getLogger(null);
       
       var ch=sc.nextInt();
       var otpn=sc.nextInt();
       
       logger.info("1. Menu");
       logger.info("Enter any key to exit");
       String choice=sc.next();
       
       if(!choice.equals("1"))
       {
    	   logger.info("Thank you");
    	   System.exit(0);
       }
       while(choice.equals("1"))
       {
    	   try
    	   {
    		   logger.info("1. Insert/create Employee Details");
    		   logger.info("2. Update Employee Details");
    		   logger.info("3. Delete Employee Details");
    		   logger.info("4. Show Employee Details");
    		   logger.info("5.Raise Salary");
    		   logger.info("Any key to Exit");
    		   
    		   String choice2=sc.next();
    		   
    		   switch(choice2)
    		   {
    		      case "1": logger.info("\nChoose the employee you want to create:");
    		                logger.info("\n1.Clerk \n2.Programmer \n3.Manager");
    		                
    		                 
    		                if(ch==4)
    		                {
    		                	logger.info("Exiting---");
    		                	System.exit(0);	
    		                }
    		                switch(ch)
    		                {
    		                case 1:  Employee e1=new Clerk();      
    		                	     e1.insert();
    		                          s.create(e1);
    		                          break;
    		                case 2: e1=new Programmer();
   		                             e1.insert();
   		                            s.create(e1);
   		                            break;
    		                case 3:  e1=new Manager();
	                                 e1.insert();
	                                 s.create(e1);
	                                  break;
	                         default: logger.info("Choose among above");
    		                }         
    		                
    		                break;
    		      case "2": var e2=new Employee();
    		    	          logger.info("Enter name");
    		    	          e2.setName(sc.next());
    		    	          
    		    	          logger.info("Enter age");
    		    	          e2.setAge(sc.next());
    		    	          
    		    	          logger.info("Enter email id");
    		    	           e2.setEmailId(sc.next());
    		    	           
    		    	           s.update(e2);
    		    	           break;
    		      case "3": logger.info("Enter email");
    		                String email=sc.next();
    		                
    		               s.deleteByEmail(email);
    		               break;
    		         
    		      case "4":logger.info("\n1.Show particular employee details using email id\n 2. Show all Employees \n3. Show sorted Employee details");
                         
                           switch(otpn)
                           {
                           case 1: logger.info("Enter email");
                                    String email1=sc.next();
                                    
                                    var e=s.getEmployeeByEmail(email1);
                                   
                                    logger.info(e.toString());
                                  
                                    break;
                                    
                           case 2: logger.info("Displaying all the employees in the table");
                                    List<Employee> employeeList=s.getAllEmployees();
                                    employeeList.forEach(employee -> logger.entering("entry","finer",employee));
                        	         break;
                        	       
                           case 3: logger.info("Displaying all the employee details sorted by emailId");
                                   Set<Employee> employeeSet=s.getAllEmployeesSortByEmailId();
                                   employeeSet.forEach(employee->logger.entering( "entry", "finer",employee));
                                   break;
                           default: logger.info("");
                           }
                           break;
    		      default : logger.info("Exiting.......");
    		                System.exit(0);
    		              
    		   }
    		   
    	   }
    	   catch(Exception sqle)
    	   {
    		   sqle.printStackTrace();
    	   }
       }
       
	}
}

