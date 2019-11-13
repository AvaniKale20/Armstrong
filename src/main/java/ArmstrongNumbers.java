import static java.lang.Math.pow;

class ArmstrongNumbers {
    int ans;

    boolean isArmstrongNumber(int numberToCheck) {

        int number = numberToCheck;
        String numberOfDigits = String.valueOf(numberToCheck);
        int length = numberOfDigits.length();


        while (numberToCheck > 0) {

            int remainder = numberToCheck % 10;
            ans = ans + (int) pow(remainder, length);
            numberToCheck = numberToCheck / 10;

        }
        if (ans == number) {
            return true;
        }
        return false;
    }
}
