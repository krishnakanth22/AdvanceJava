public class LastDigit {
    public static int getLastDigit(int number) {
        // Convert negative number to positive
        number = Math.abs(number);
        
        // Get the last digit by taking modulo 10
        int lastDigit = number % 10;
        
        return lastDigit;
    }
    
    public static void main(String[] args) {
        int number = -197;
        int lastDigit = getLastDigit(number);
        
        System.out.println("The last digit of " + number + " is " + lastDigit);
    }
}
