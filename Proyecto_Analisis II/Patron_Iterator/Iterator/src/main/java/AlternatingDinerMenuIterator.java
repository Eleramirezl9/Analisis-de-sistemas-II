import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AlternatingDinerMenuIterator {
    private final MenuItem[] items;
    private int position = 0;

    public MenuItem next() {
        MenuItem menuItem = items[position];
        position += 2;
        return menuItem;
    }

    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }
}
