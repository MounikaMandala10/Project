import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
public class TestMyJunit {
   /* @Test
    public void testWelcome1() {
       GreetMessenger  greetMsg =new GreetMessenger("Welcome to Junit");
        assertEquals("Welcome to Junit",greetMsg.getGreeting());
    System.out.println("testWelcome is over...");
    }*/
   /* @Test
    public void testSomeAssertions() {
    	int empno=7839;
    	String empname="King";
    	String empjob="PRESIDENT";
    	
    	assertEquals("PRESIDENT",empjob);
    	System.out.println("empjob passed...");
 	    
    	assertTrue(empno>1000);
    	System.out.println("empno passed...");
 	    
    	assertNotNull(empname);
    	System.out.println("empname passed...");
    	System.out.println("testsomeAssertions is over...");
	    	
    }*/
   /* @Test
    public void test2() {
    	SavingsAccount savObj = new SavingsAccount(85000);
    
      assertNotNull(savObj);
      savObj.withdraw(15000);
      assertEquals(70000, savObj.getBankBalance(),"Balance is not matching");    

    }*/
   /* @Test
    public void test3() {
       GreetMessenger  greetMsg =new GreetMessenger("Welcome to Junit");
       assertEquals("Welcome to Junit",greetMsg.getGreeting());
    System.out.println("testWelcome is over...");
    } */
	
	
	@Test
    public  void deptSelect()
    {
		Department deptObj1 = new Department();
		deptObj1.setDepartmentNumber(55);
		System.out.println("dept number :"+deptObj1.getDepartmentNumber());
		System.out.println("dept name :"+deptObj1.getDepartmentName());
		System.out.println("dept location :"+deptObj1.getDepartmentLocation());
		assertEquals(55, deptObj1.getDepartmentNumber());
		//assertEquals("CODING", deptObj1.getDepartmentName());
		//assertEquals("NewDelhi", deptObj1.getDepartmentLocation());
    }
		
	@Test
    public  void testaddDepartment()
    {
		Department deptObj1 = new Department();
		deptObj1.setDepartmentNumber(55);
		deptObj1.setDepartmentName("CODING");
		deptObj1.setDepartmentLocation("New Delhi");
		DepartmentDAOImpl ddiObj = new DepartmentDAOImpl(); 
		ddiObj.addDepartment(deptObj1);
		assertEquals(55, deptObj1.getDepartmentNumber());
		
}
}
    
