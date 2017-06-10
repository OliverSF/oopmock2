package question2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DrawingUnitTest {
	
	Drawing car;
	Drawing chassis;
	
	Point Point1;
	Rectangle body;
	
	Point Point2;
	Rectangle top;
	
	Point hub1;
	Point hub2;
	Circle wheel1;
	Circle wheel2;
	
	
	@Before
	public void setUp() throws Exception {
		
		double[] input = {2,3,3,1,3,4,1,1,0.5,2.5,4.5};
		
		car = new Drawing();
		Point1 = new Point(input[0], input[1]);
		body = new Rectangle(Point1, input[2], input[3]);
		Point2 = new Point(input[4], input[5]);
		top = new Rectangle(Point2, input[6], input[7]);
		
		hub1 = new Point(input[9], input[0]);
		hub2 = new Point(input[10], input[0]);
		
		wheel1 = new Circle(hub1, input[8]);
		wheel2 = new Circle(hub2, input[8]);
		chassis = new Drawing();
	}

	@Test
	public void numOfPartstest() {

		int expectedResult = 4;
		
		car.add(body);
		car.add(top);
		chassis.add(wheel1);
		chassis.add(wheel2);
		car.add(chassis);
		
		int actualResult = car.getNumShapes();
		
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	public void getOverallAreaTest(){
		
		double expectedResult = 5.570796326794897;
		
		car.add(body);
		car.add(top);
		chassis.add(wheel1);
		chassis.add(wheel2);
		car.add(chassis);
		
		double actualResult = car.getOverallArea();
		
		assertEquals(expectedResult, actualResult, 0);
	}

}
