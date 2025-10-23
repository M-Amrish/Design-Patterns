package Strategy;

public class CarPathCalculation implements PathCalculatorStrategy{
    @Override
    public void findPath(String from, String to) {
        System.out.println("Car path calculation");
    }
}
