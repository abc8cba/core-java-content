package session7.abstraction;

public class TestRemainingArea {

	public static void main(String[] args) {
		Shape shape1 = new Circle();
		Shape shape2 = new Square();
		Shape shape3 = new Rectangle();
		
		Shape[] shapes = new Shape[3];
		shapes[0] = shape1;
		shapes[1] = shape2;
		shapes[2] = shape3;
		
		double internalArea = 0;
		for(Shape shape:shapes) {
			internalArea = internalArea + shape.area();
		}
		System.out.println("Internal Area = "+internalArea);
		
		double totalArea = 100*100;
		System.out.println("Total area = "+totalArea);
		double remainingArea = totalArea - internalArea;
		System.out.println("Remaining area = "+remainingArea);

	}

}
