import java.util.ArrayList;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PancakeHouseMenu {
    private final ArrayList<MenuItem> menuItems = new ArrayList<>();

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
