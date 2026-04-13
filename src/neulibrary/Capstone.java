package neulibrary;

public class Capstone implements Resource {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowing Capstone: " + title);
    }
}
