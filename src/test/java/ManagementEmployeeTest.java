import static org.junit.Assert.*;

import org.junit.Test;

import com.fanniemae.payroll.Employee;
import com.fanniemae.payroll.ManagementEmployee;

public class ManagementEmployeeTest {

	@Test
	public void testHourlyWage() {
		ManagementEmployee m = new ManagementEmployee(52_000, 40);
		float wage = m.getHourlySalary();
		
		assertTrue(wage == 25);
	}

	@Test
	public void testWeeklyWage() {
		ManagementEmployee m = new ManagementEmployee(52_000, 40);
		float weeklySalary = m.getWeeklySalary();
		
		assertTrue(weeklySalary == 1_000);
	}	

	
	@Test
	public void test() {
		ManagementEmployee m = new ManagementEmployee(52_000, 40);
		float monthlySalary = m.getMonthlySalary();
		assertTrue("salary: " + monthlySalary, monthlySalary > 1000);
	}	

	
	@Test
	public void testMonthlyWage() {
		Employee m = new ManagementEmployee(52_000);
		float monthlySalary = m.getMonthlySalary();
		assertTrue("salary: " + monthlySalary, monthlySalary > 4_333);
	}	
	
}
