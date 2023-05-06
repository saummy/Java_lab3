import java.util.*;
public class lab3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // Get input array from user
        System.out.print("Enter the number of elements: ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        // Menu for the process selection
        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Find the Mean Value");
            System.out.println("2. Find the Median Value");
            System.out.println("3. Find the Mode Value");
            System.out.println("4. Exit");

            int choice = obj.nextInt();
            switch (choice) {
                case 1:
                    double mean = Mean(arr);
                    System.out.println("Mean Value: " + mean);
                    break;
                case 2:
                    double median = Median(arr);
                    System.out.println("Median Value: " + median);
                    break;
                case 3:
                    int mode = Mode(arr);
                    System.out.println("Mode Value: " + mode);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    // Function to calculate mean
    public static double Mean(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    // Function to calculate median
    public static double Median(int[] arr) {
        int middle = arr.length / 2;
        if (arr.length % 2 == 0) {
            return (arr[middle - 1] + arr[middle]) / 2.0;
        } else {
            return arr[middle];
        }
    }

    // Function to calculate mode
    public static int Mode(int[] arr) {
        int mode = arr[0];
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                mode = arr[i];
                maxCount = count;
            }
        }
        return mode;
    }
}