package test.defaultt.method.in.interfac;

public interface I1 {

	void method1();
	
	default void log(String str){
		System.out.println("I1 logging::"+str);
	}
}
