package factory.design.pattern;

public class CrudOperationHibernate implements CrudOperation {

	@Override
	public void save() {
		System.out.println("Save operation using Hibernate");

	}

	@Override
	public void delete() {
		System.out.println("Delete operation using Hibernate");

	}

}
