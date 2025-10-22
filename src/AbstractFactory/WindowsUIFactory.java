package AbstractFactory;

import AbstractFactory.components.button.Button;
import AbstractFactory.components.button.WindowsButton;
import AbstractFactory.components.dropdown.Dropdown;
import AbstractFactory.components.dropdown.WindowsDropDown;
import AbstractFactory.components.menu.Menu;
import AbstractFactory.components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public Dropdown createDropDown() {
        return new WindowsDropDown();
    }
}
