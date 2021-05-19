package creational.singleton;

public class MyThread1 extends Thread{
	public void run()
	{
		Singleton ob1= Singleton.createInstance();
		System.out.println("ob3 refrence in myThread3 = "+ob1);
	}

}
