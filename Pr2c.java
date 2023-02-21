import java.util.Scanner;

public class Pr2c {
    public static void main(String arg[]) {
        long number, sum;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            number = scan.nextLong();
        }
        for (sum = 0; number != 0; number = number / 10) {

            sum = sum + number % 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
