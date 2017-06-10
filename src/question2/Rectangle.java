package question2;

/**
 * Rectangle class represents a rectangle 
 * in 2 dimensional space
 * It is defined by a Point that represents its top left hand corner
 * and by its width and height
 */

//class Rectangle extends Component, have created a generic class Component
//to allow composite design pattern, allows arraylist of different objects to be created
public class Rectangle extends Component{
		
	//creating private variables
	//point will hold the coordinates of the rectangle object
	private Point point;
	private double width;
	private double height;
	
	//constructor
	public Rectangle(Point point1, double wid, double high) {
		
		//setting variables
		this.point = point1;
		this.width = wid;
		this.height = high;

	}

	@Override
	public double getOverallArea() {
		
		double overallAreaofShape = width*height;
		
		return overallAreaofShape;
		
	}

	@Override
	public int getNumShapes() {
		
		return 1;
	}

}
