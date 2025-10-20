package Singleton;

/*
public class Main {
    public static void main(String[] args) {

        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();

        System.out.println(databaseConnection);
        System.out.println(databaseConnection1);
        // both will print the same address space i.e same object.
        // constructor will be only called once
    }
}
*/

// checking above code in multithreading environment

// will fail.
// No of times constructor can be called from '1' to 'n'(no of threads).

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {


        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(() -> DatabaseConnection.getInstance());
        executor.execute(() -> DatabaseConnection.getInstance());
        executor.execute(() -> DatabaseConnection.getInstance());
    }
}

