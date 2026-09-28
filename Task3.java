import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter minutes: ");
        int userMinutes = scanner.nextInt();

        int totalMinutes = (12 * 60) + userMinutes;

                int hours = (totalMinutes / 60) % 12;
        int minutes = totalMinutes % 60;

        System.out.println(hours + ":" + minutes);

        scanner.close();
    }
}