package neulibrary;

public class Newspaper implements Resource {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowing Newspaper: " + title);
    }
}
