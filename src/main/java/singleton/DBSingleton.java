package singleton;

public class DBSingleton {

    // Rules
    // 1. Private Constructor
    // 2. Single instance can only be created

    // Reference: https://www.geeksforgeeks.org/volatile-keyword-in-java/
    // For Making it thread safe
    // Thread Safe: Method or class can be used by multiple threads at the same time without any problem
    private static volatile DBSingleton instance = null;

    private DBSingleton() {
        if(instance != null){
            // Blocks implementations of using reflection to create new object
            throw  new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DBSingleton getInstance(){
        // Lazy Load with null Check
        // Improves performance because every request will check if it is not null and only then creates
        // Helps in bringing up the application faster
        // Reference: https://en.wikipedia.org/wiki/Lazy_loading
        if(instance == null){
            // For making it thread safe we need to used synchronized
            // Also used synchronized only on block of code rather than whole method
            // If two threads access at the same time - only one can execute
            // Additional null check is present so that thread actually creating the object ensures that object is not created already
            synchronized (DBSingleton.class) {
                if(instance == null){
                    instance = new DBSingleton();
                }
            }
        }
        return instance;
    }
}
