package Factory;

public class Car implements Vehicle{
    @Override
    public void createVehicle() {
        System.out.println("Creating Car");
    }
}
