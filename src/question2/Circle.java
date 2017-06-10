package question2;

/**
 * Circle class represents a circle 
 * in 2 dimensional space
 * It is defined by a Point that represents its top left hand corner
 * and by its width and height
 */

public class Circle extends Component{
	
	private Point centrepoint;
	private double radius;
	
	public Circle(Point hub1, double rad) {
		
		this.centrepoint = hub1;
		this.radius = rad;
	}

	@Override
	public double getOverallArea() {
		
		double overAllAreaofShape = (Math.PI)*radius*radius;
		
		return overAllAreaofShape;
	}

	@Override
	public int getNumShapes() {
		
		return 1;
	}
	
	//ToDo : you must implement the functionality of the Circle class

}
