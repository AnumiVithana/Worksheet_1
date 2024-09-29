import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length in centimetres : ");
        double length = scanner.nextDouble();

        double inches = length / 2.54;

        int feet = (int)(inches/12);
        double remainInches = inches%12;

        System.out.println(feet+" feet and "+remainInches+" inches");
    }
}
