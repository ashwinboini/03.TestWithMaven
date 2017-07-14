import static org.junit.Assert.*;

import org.junit.Test;

import com.fanniemae.payroll.dao.CarRepository;

public class CarTest {

	@Test
	public void testSizeFor10Items() {

		CarRepository carRep = new CarRepository();
		
		int size = carRep.findMaps().size();
		
		assertTrue("Size is: " + size, size ==3);
	}

}
