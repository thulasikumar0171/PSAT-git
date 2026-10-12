import java.util.Scanner;

public class RideSharingPlatformSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter passenger name: ");
        String name = sc.nextLine();

        System.out.print("Enter distance in km: ");
        double distance = sc.nextDouble();

        if (distance <= 0) {
            System.out.println("Invalid distance");
        } else {
            double fare = 50 + (distance * 15);

            System.out.println("Passenger: " + name);
            System.out.println("Distance: " + distance + " km");
            System.out.println("Total Fare: Rs." + fare);
        }

        sc.close();
    }
}

Input:

Enter passenger name: Rahul
Enter distance in km: 10

Output:

Passenger: Rahul
Distance: 10.0 km
Total Fare: Rs.200.0