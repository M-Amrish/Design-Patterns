package Factory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter vehicle name: ");

        String vehicleType = sc.nextLine();
        System.out.print("vehicleType: ");
        System.out.println(vehicleType);
        // without Factory
/*
        Vehicle vehicle = null;

        if (vehicleType.equals("car")){
            vehicle = new Car();
        } else if (vehicleType.equals("bike")) {
            vehicle = new Bike();
        }

        vehicle.createVehicle();
*/
        // solving using factory design pattern

        Vehicle vehicle = VehicleFactory.getVehicle(vehicleType);
        vehicle.createVehicle();

    }
}