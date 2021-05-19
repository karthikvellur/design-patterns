package creational.singleton;

public class MyThread3 extends Thread{
	public void run()
	{
		Singleton ob3= Singleton.createInstance();
		System.out.println("ob3 refrence in myThread3 = "+ob3);
	}

}
