package Strategy;

public class GoogleMap {

    public void findPath(String from, String to, String mode){
        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getMode(mode);

        pathCalculatorStrategy.findPath(from,to);
    }
}
