package Restaurant;
import java.util.ArrayList;
import java.util.List;
public class Menu {
    private List<MenuItem> menuItems;

    public Menu() {
        this.menuItems = new ArrayList<>();

        initializeMenu();
    }


    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }


    private void initializeMenu() {

        MenuItem appetizer1 = new MenuItem("Mozzarella sticks", "3 pieces of mozzarella sticks", 3.0, "appetizer");
        MenuItem appetizer2 = new MenuItem("Onion rings", "3 pieces of crunchy onion rings", 4.0, "appetizer");
        MenuItem appetizer3 = new MenuItem("Cream soup", "white sauce cream soup with mushroom", 6.0, "appetizer");
        MenuItem mainCourse1 = new MenuItem("Smoked House BBQ", "Smash Burger - lettuce - pickles - fries - Cheddar sauce - mozzarella sticks - mayonnaise", 23.0, "main course");
        MenuItem mainCourse2 = new MenuItem("Mushroom Ranch", "Burger patty 250g - ranch sauce - mushroom - onion rings - tomato - pickles - lettuce - beef bacon", 27.0, "main course");
        MenuItem mainCourse3 = new MenuItem("Beef Buster", "Burger patty 300g injected with american cheese- tomato - pickles - lettuce - beef bacon - swiss cheese - mushroom", 28.0, "main course");
        MenuItem dessert1 = new MenuItem("Decadent Chocolate Lava Cake", "A warm, molten chocolate cake bursting with rich chocolate sauce at its core. Served with a scoop of vanilla ice cream.", 12.0, "dessert");
        MenuItem dessert2 = new MenuItem("Summer Berry Panna Cotta", "Light and creamy Italian panna cotta infused with fresh summer berries and topped with a dollop of whipped cream", 13.0, "dessert");
        MenuItem dessert3 = new MenuItem("Classic New York-Style Cheesecake", "LA dense and creamy cheesecake with a buttery graham cracker crust", 17.0, "dessert");

        addMenuItem(appetizer1);
        addMenuItem(appetizer2);
        addMenuItem(appetizer3);
        addMenuItem(mainCourse1);
        addMenuItem(mainCourse2);
        addMenuItem(mainCourse3);
        addMenuItem(dessert1);
        addMenuItem(dessert2);
        addMenuItem(dessert3);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }


}
