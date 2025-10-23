package Strategy;

public class Client {
    public static void main(String[] args) {

        GoogleMap googleMap = new GoogleMap();
        googleMap.findPath("Bangalore", "kerala", "bike");
    }
}
