package question2;

import java.util.ArrayList;

/**
 * a Drawing object is composed of number of basic shape objects (e.g Rectangle, Circle, Point)
 * and other Drawing objects
 *
 */
public class Drawing extends Component{
	
	
	private ArrayList<Component> components;
	
	public Drawing(){
		components = new ArrayList<Component>();
	}
	
	
	
	public void add(Component comp){
		
		this.components.add(comp);
	}
	
	
	
	@Override
	public double getOverallArea() {
		
		double overallArea = 0;
		
		for(Component comp : components){
			
			overallArea += comp.getOverallArea();
		}
		
		return overallArea;
	}

	@Override
	public int getNumShapes() {
		
		int numShapes = 0;
		
		for(Component comp : components){
						
			numShapes += comp.getNumShapes();
			//hardcode 1 into the basic/bottom classes
			
			
		}
		//numShapes++; you could add this in to 
		return numShapes;
		
	}
	
	//ToDo : you must implement the functionality of the Drawing class

}
