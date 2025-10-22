package AbstractFactory.components.button;

public class WindowsButton implements Button{
    @Override
    public void showButton() {
        System.out.println("Showing WINDOWS button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking WINDOWS button");
    }
}
