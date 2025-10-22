package AbstractFactory;

import AbstractFactory.components.button.Button;
import AbstractFactory.components.button.IsoButton;
import AbstractFactory.components.dropdown.Dropdown;
import AbstractFactory.components.dropdown.IosDropDown;
import AbstractFactory.components.menu.IosMenu;
import AbstractFactory.components.menu.Menu;

public class IosUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IsoButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public Dropdown createDropDown() {
        return new IosDropDown();
    }
}
