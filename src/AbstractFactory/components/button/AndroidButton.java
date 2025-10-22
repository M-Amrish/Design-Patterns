package AbstractFactory.components.button;

public class AndroidButton implements Button{
    @Override
    public void showButton() {
        System.out.println("Showing ANDROID button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking ANDROID button");
    }
}
