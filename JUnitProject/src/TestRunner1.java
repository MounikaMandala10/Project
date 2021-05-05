import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/*import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;*/

public class TestRunner1 {

	public static void main(String[] args) {
		System.out.println("Running test class..");
		Result result=JUnitCore.runClasses(TestMyJunit.class);
		System.out.println("Greeting failure if it has...");
		for(Failure failure : result. getFailures())
		{
		System.out.println(failure.toString());
		System.out.println("--------------");
		
		}
		System.out.println("status :"+result.wasSuccessful());
	}

}
//first testcase into insert
//select that record