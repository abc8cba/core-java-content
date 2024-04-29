package factory.design.pattern;

public class FactoryClass {

	public CrudOperation getInstance(String key){
		if(key.equals("jdbc")){
			return new CrudOperationJdbc();
		}else if(key.equals("hibernate")){
			return new CrudOperationHibernate();
		}
		return null;
	}
	
	
}
