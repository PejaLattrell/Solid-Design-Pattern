package neulibrary;

public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student();

       
        
        Resource book = new Book();
        student.borrowResource(book, "Effective Java");
        
        Resource journal = new Journal();
        student.borrowResource(journal, "IEEE Software");

        Resource thesis = new Thesis();
        student.borrowResource(thesis, "Deep Learning for Healthcare");
        
        Resource internet = new InternetAccess();
        student.borrowResource(internet, "WS-01"); // Using terminal WS-01
        
        
        Resource audioBook = new Resource() {
            @Override
            public void borrow(String title) {
                System.out.println("Listening to Audio Book: " + title);
            }
        };
        student.borrowResource(audioBook, "The Pragmatic Programmer (Audio)");
    }
}
