import java.util.Scanner;

public class StreamAnalyticsEngine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Enter values:");

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            sum += value;
            min = Math.min(min, value);
            max = Math.max(max, value);
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double) sum / n);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        sc.close();
    }
}

Input:

Enter number of elements: 5
Enter values:
10 20 30 40 50

Output:

Sum: 150
Average: 30.0
Minimum: 10
Maximum: 50