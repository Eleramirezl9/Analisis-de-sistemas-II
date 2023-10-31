import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MenuItem {
    private final String name;
    private final String description;
    private final boolean vegetarian;
    private final double price;

}
