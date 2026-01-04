public class Main {
    public static void main(String[] args) {
        // 1. Create a new Bug object
        Bug myBug = new Bug(1, "Login Page Error", "High");

        // 2. Display the initial title
        System.out.println("Initial Bug Title: " + myBug.getTitle());

        // 3. Test the Clean Code validation
        System.out.println("Attempting to set an empty title...");
        myBug.setTitle(""); 
        
        // This will still print the old title because your code blocked the empty update!
        System.out.println("Title after empty update: " + myBug.getTitle());
    }
}
