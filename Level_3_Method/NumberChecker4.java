
// Creating NumberChecker4 Class to check the number on given conditions
public class NumberChecker4{

    // Implementing method to check if a number is a prime number
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Implementing method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        return sumOfDigits(square) == number;
    }

    // Implementing method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0, product = 1;
        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }

    // Implementing method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Implementing method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // Helper method to store the digits of the number in a digits array
    private static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Helper method to find the sum of the digits of a number
    private static int sumOfDigits(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 121; // You can test with other numbers as well

        System.out.println("Is Prime Number: " + isPrime(number));

        System.out.println("Is Neon Number: " + isNeonNumber(number));

        System.out.println("Is Spy Number: " + isSpyNumber(number));

        System.out.println("Is Automorphic Number: " + isAutomorphicNumber(number));

        System.out.println("Is Buzz Number: " + isBuzzNumber(number));
    }
}

