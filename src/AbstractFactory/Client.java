package AbstractFactory;

import AbstractFactory.components.button.Button;
import AbstractFactory.components.dropdown.Dropdown;
import AbstractFactory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {

        Flutter flutter = new Flutter();



        UIFactory uiFactory = flutter.getUIFactory(SupportedPlatforms.WINDOWS);

        Button button = uiFactory.createButton();
        button.clickButton();

        Menu menu = uiFactory.createMenu();
        menu.showMenu();

        Dropdown dropdown = uiFactory.createDropDown();
        dropdown.showDropDown();
    }
}
