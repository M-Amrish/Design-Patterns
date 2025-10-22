package AbstractFactory;

import AbstractFactory.components.button.AndroidButton;
import AbstractFactory.components.button.Button;
import AbstractFactory.components.dropdown.AndroidDropDown;
import AbstractFactory.components.dropdown.Dropdown;
import AbstractFactory.components.menu.AndroidMenu;
import AbstractFactory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Dropdown createDropDown() {
        return new AndroidDropDown();
    }
}
