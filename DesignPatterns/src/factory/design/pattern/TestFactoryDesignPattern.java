package factory.design.pattern;

public class TestFactoryDesignPattern {

	public static void main(String[] args) {
		FactoryClass fc = new FactoryClass();

		CrudOperation operation = fc.getInstance("hibernate");
		operation.save();
		operation.delete();
		
//		CrudOperation operation = fc.getInstance("jdbc");
//		operation.save();
//		operation.delete();
	}

}
