import java.io.*;
import java.util.*;

// Read only region start

class UserMainCode {
    public int secondLastDigitOf(int input1) {
        // Write code here...
        int secondLastDigit = 0;

        // Convert the input to a positive number
        int num = Math.abs(input1);

        // Extract the second last digit
        while (num > 9) {
            num = num / 10;
        }
        secondLastDigit = num % 10;

        return secondLastDigit;
    }
}
