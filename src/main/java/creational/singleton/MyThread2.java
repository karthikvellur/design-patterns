package creational.singleton;

public class MyThread2 extends Thread {
	public void run()
	{
		Singleton ob2= Singleton.createInstance();
		System.out.println("ob2 refrence in myThread2 = "+ob2);
	}

}
