package Numbers;

public class Check_PrimeNumber {
    public static void main(String[] args) {
        int number = 10;
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime");
        }
    }
}
