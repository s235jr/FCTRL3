import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scaner = new Scanner(System.in);
        int numberOfCases = scaner.nextInt();

        for (int i = 0; i < numberOfCases; i++) {
            int valueToAnalize = scaner.nextInt();
            if (valueToAnalize <= 1) {
                System.out.println("0 1");
            } else if (valueToAnalize == 2) {
                System.out.println("0 2");
            } else if (valueToAnalize == 3) {
                System.out.println("0 6");
            } else if (valueToAnalize == 4) {
                System.out.println("2 4");
            } else if (valueToAnalize == 5) {
                System.out.println("2 0");
            } else if (valueToAnalize == 6) {
                System.out.println("2 0");
            } else if (valueToAnalize == 7) {
                System.out.println("4 0");
            } else if (valueToAnalize == 8) {
                System.out.println("2 0");
            } else if (valueToAnalize == 9) {
                System.out.println("8 0");
            } else {
                System.out.println("0 0");
            }
        }
    }
}
