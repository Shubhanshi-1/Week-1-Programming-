public class NullPointerExceptionDemo {

    // Wrting method to generate a NullPointerException
    public static void generateNullPointerException() {
        String text = null;
        // Call a method on a null object will throw a NullPointerException
        System.out.println(text.length());  // This will generate NullPointerException
    }

    // Function to demonstrate handling NullPointerException
    public static void handleNullPointerException() {
        String text = null;
        try {
            // Trying to call a method on a null object
            System.out.println(text.length());  // This will generate NullPointerException
        } catch (NullPointerException e) {
            // Handling the exception
            System.out.println("Caught NullPointerException: The string is null.");
        }
    }

    public static void main(String[] args) {
        // Calling the method to generate the exception (this will crash the program)
        System.out.println("Generating NullPointerException:");
        generateNullPointerException();

        // Refactored code to handle the exception using try-catch
        System.out.println("\nHandling NullPointerException:");
        handleNullPointerException();
    }
}
