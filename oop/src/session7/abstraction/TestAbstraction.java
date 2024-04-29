package session7.abstraction;

public class TestAbstraction {

	public static void main(String[] args) {
		Calculator obj1 = new Addition();
		Calculator obj2 = new Subtraction();
		Calculator obj3 = new Multiplication();
		
//		System.out.println(obj1.calculate(10, 5));
//		System.out.println(obj2.calculate(10, 5));
//		System.out.println(obj3.calculate(10, 5));
		
		Calculator[] calculations = new Calculator[3]; 
		calculations[0] = obj1;
		calculations[1] = obj2;
		calculations[2] = obj3;
		
		for(Calculator obj:calculations) {
			System.out.println(obj.calculate(12, 3));
		}

	}

}
