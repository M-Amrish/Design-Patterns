package Strategy;

public class PathCalculatorFactory {

    public static PathCalculatorStrategy getMode(String mode){

        if(mode.equals("bike")){
            return  new BikePathCalculation();
        } else if (mode.equals("car")) {
            return  new CarPathCalculation();
        }else{
            return  new WalkPathCalculation();
        }
    }
}
