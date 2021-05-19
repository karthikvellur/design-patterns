package creational.singleton;

public class Singleton {

	private static Singleton var;

	private Singleton() {
		System.out.println("contructor function for singleton");
	}

	// Without synchronized access each thread can create a singleton at the same resulting in 3 new objects
	// If synchronized keyword is used, only one thread can access at a time so only one object would be created
	// Try out running with and without synchronized keyword
	synchronized public static Singleton createInstance() {
		if(var == null)
			var = new Singleton();
		return var;
	}

}
