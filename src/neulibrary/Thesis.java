package neulibrary;

public class Thesis implements Resource {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowing Thesis: " + title);
    }
}
