package singleton;

public class DBSingleton {

    // Private Constructor
    // Single instance can only be created

    // Reference: https://www.geeksforgeeks.org/volatile-keyword-in-java/
    // For Making it thread safe
    private static volatile DBSingleton instance = null;

    private DBSingleton() {
    }

    public static DBSingleton getInstance(){
        // Lazy Load with null Check
        // Improves performance because every request will check if it is not null and only then creates
        // Helps in bringing up the application faster
        // Reference: https://en.wikipedia.org/wiki/Lazy_loading
        if(instance == null){
            instance = new DBSingleton();
        }
        return instance;
    }
}
