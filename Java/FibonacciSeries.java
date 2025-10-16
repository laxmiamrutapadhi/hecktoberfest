import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Series up to " + n + " terms:");
        if (n >= 1) {
            int first = 0;
            int second = 1;
            StringBuilder series = new StringBuilder();
            series.append(first).append(" ").append(second).append(" ");

            for (int i = 3; i <= n; i++) {
                int next = first + second;
                series.append(next).append(" ");
                first = second;
                second = next;
            }

            System.out.print(series);
        } else if (n == 1) {
            System.out.print("0");
        }

        System.out.println();
        scanner.close();
    }
}
