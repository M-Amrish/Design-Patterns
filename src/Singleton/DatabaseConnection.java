package Singleton;

public class DatabaseConnection {
    // just like a flag
    public static  DatabaseConnection instance = null; // to return a single instance

    private DatabaseConnection(){
        System.out.println("DB set instantiated");
    }
    /*
    public static DatabaseConnection getInstance(){
        if(instance == null)
            instance = new DatabaseConnection();

        return instance;
    }
    */
    // implementing 'getInstance( )' for multithreading environment.
    // But still it won't work.
    /*
    public static DatabaseConnection getInstance(){
        if(instance == null)
            // thread1, thread2
            synchronized (DatabaseConnection.class){
                instance = new DatabaseConnection();
            }
        // say some very heavy work
        return instance;
    }
    */

    // final way of resolving issue in multithreading
    // Double-checking / Double locking

    public static DatabaseConnection getInstance(){
        if(instance == null) // optimisation
            // thread1, thread2
            synchronized (DatabaseConnection.class){
                if (instance == null) { // Double-checking
                    instance = new DatabaseConnection();
                }
            }
        // say some very heavy work
        return instance;
    }

}
