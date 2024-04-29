package factory.design.pattern;

public class CrudOperationJdbc implements CrudOperation {

	@Override
	public void save() {
		System.out.println("Save operation using jdbc");

	}

	@Override
	public void delete() {
		System.out.println("Delete operation using jdbc");

	}

}
