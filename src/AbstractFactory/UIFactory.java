package AbstractFactory;


import AbstractFactory.components.button.Button;
import AbstractFactory.components.dropdown.Dropdown;
import AbstractFactory.components.menu.Menu;

public interface UIFactory {
    //Factory Methods.
    Button createButton();

    Menu createMenu();

    Dropdown createDropDown();


}
