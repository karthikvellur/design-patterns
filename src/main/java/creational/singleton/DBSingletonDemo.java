package creational.singleton;

public class DBSingletonDemo {

    public static void main(String[] args){
        DBSingleton instance = DBSingleton.getInstance();

        System.out.println("Instance 1" + instance);

        System.out.println("Instance 2" + DBSingleton.getInstance());
    }
}
