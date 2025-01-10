import java.util.Scanner;

public class FriendsComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input ages and heights for Amar, Akbar, and Anthony
        System.out.print("Enter the age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter the height of Amar (in cm): ");
        double heightAmar = sc.nextDouble();

        System.out.print("Enter the age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter the height of Akbar (in cm): ");
        double heightAkbar = sc.nextDouble();

        System.out.print("Enter the age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter the height of Anthony (in cm): ");
        double heightAnthony = sc.nextDouble();

        // Determining the youngest friend
        String youngest;
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            youngest = "Amar";
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        // Determining  the tallest friend
        String tallest;
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            tallest = "Amar";
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        // Displaying the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        sc.close();
    }
}
