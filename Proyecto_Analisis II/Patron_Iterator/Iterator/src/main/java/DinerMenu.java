import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DinerMenu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private final MenuItem[] menuItems = new MenuItem[MAX_ITEMS];

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }







    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
