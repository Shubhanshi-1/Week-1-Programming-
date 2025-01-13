
public class NumberChecker {

    public static void main(String[] args) {
        int number = 153; // assigning 153 to number
        System.out.println("Number: " + number);
        System.out.println("Is Duck Number: " + isDuckNumber(number));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number));
        System.out.println("Largest & Second Largest Digits: " + Arrays.toString(findLargestDigits(number)));
    }
	
     // checking is there's a duck number
    public static boolean isDuckNumber(int number) {
        String numberString = Integer.toString(number);
        return numberString.contains("0") && numberString.charAt(0) != '0';
    }
    // Checking armstrong number
    public static boolean isArmstrongNumber(int number) {
        int sum = 0, temperature = number;
        int digits = Integer.toString(number).length();
        while (temperature > 0) {
            int digit = temperature % 10;
            sum += Math.pow(digit, digits);
            temperature /= 10;
        }
        return sum == number;
    }
// function for finding largest
    public static int[] findLargestDigits(int number) {
        int[] digits = Integer.toString(number).chars().map(c -> c - '0').toArray();
        int largest = Integer.MIN_VALUE, secLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secLargest = largest;
                largest = digit;
            } else if (digit > secLargest && digit != largest) {
                secLargest = digit;
            }
        }
        return new int[] { largest, secLargest };
    }
}
