package neulibrary;

public class InternetAccess implements Resource {
    @Override
    public void borrow(String title) {
        System.out.println("Accessing Internet via Terminal: " + title);
    }
}
