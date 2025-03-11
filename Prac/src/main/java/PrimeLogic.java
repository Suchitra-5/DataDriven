import java.util.Scanner;

public class PrimeLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int i = sc.nextInt();
        sc.close();

        // Handle numbers <= 1 separately
        if (i <= 1) {
            System.out.println(i + " IS NOT PRIME");
            return;
        }

        boolean isPrime = true;

        // Check divisibility only up to sqrt(i)
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(i + " IS PRIME");
        } else {
            System.out.println(i + " IS NOT PRIME");
        }
    }
}
