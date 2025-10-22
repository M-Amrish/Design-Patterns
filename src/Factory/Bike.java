package Factory;

public class Bike implements Vehicle{
    @Override
    public void createVehicle() {
        System.out.println("Creating Bike");
    }
}
