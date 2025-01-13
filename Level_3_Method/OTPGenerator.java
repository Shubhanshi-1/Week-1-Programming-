
// Importing all class from util package
import java.util.*;
// Creating OTPGenerator Class to generate OTP
public class OTPGenerator {

    public static void main(String[] args) {
        int[] otps = generateUniqueOTPs(10);

        // Displaying result
        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("Are OTPs Unique: " + areOTPsUnique(otps));
    }

    // Creating generateOTP method to generate OTP
    public static int generateOTP() {
        return 100000 + new Random().nextInt(900000);
    }

    // Creating generateUniqueOTPs Method to add Unique
    public static int[] generateUniqueOTPs(int count) {
        HashSet<Integer> otpSet = new HashSet<>();
        while (otpSet.size() < count) {
            otpSet.add(generateOTP());
        }
        return otpSet.stream().mapToInt(Integer::intValue).toArray();
    }

    public static boolean areOTPsUnique(int[] otps) {
        return otps.length == new HashSet<>(Arrays.asList(Arrays.stream(otps).boxed().toArray(Integer[]::new))).size();
    }
}



