package neulibrary;

public class Book implements Resource {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowing Book: " + title);
    }
}
