package Practise;

import java.awt.*;

public class MenuExample {
	public MenuExample() {
		Frame f = new Frame();
		MenuBar mb = new MenuBar();

		MenuItem menuitem = new MenuItem(" Menu");
		MenuItem submenuitem = new MenuItem("SubMenu");

		Menu menus1 = new Menu("Item 1");
		Menu menus2 = new Menu("Item 2");
		Menu menus3 = new Menu("Item 3");
		Menu menus4 = new Menu("Item 4");
	}
}
