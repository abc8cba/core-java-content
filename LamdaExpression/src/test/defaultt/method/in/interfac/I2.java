package test.defaultt.method.in.interfac;

public interface I2 {

	void method2();
	
	default void log(String str){
		System.out.println("I2 logging::"+str);
	}
}
