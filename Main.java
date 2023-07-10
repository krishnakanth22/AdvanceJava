public class Main {
    
    // Read only region start
    
    public static int lastDigitOf(int input1) {
        // Read only region end
        // Write code here
        int lastDigit = input1 % 10;
        return lastDigit;
    }

    public static void main(String[] args) {
        int input1 = 12345; // Provide your own input value
        int result = lastDigitOf(input1);
        System.out.println(result);
    }
}
