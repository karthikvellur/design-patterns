package creational.singleton;

public class Demo {

	public static void main(String[] args) {
		MyThread1 th1=new MyThread1();
		MyThread2 th2=new MyThread2();
		MyThread3 th3=new MyThread3();
		th1.start();
		th2.start();
		th3.start();
	}

}
