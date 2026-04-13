package neulibrary;

public class Journal implements Resource {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowing Journal: " + title);
    }
}
