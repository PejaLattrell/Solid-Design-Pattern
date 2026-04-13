package neulibrary;

public class Student {
    
    public void borrowResource(Resource resource, String title) {
        resource.borrow(title);
    }
}
