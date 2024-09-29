import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the radius of the inner circle (ri): ");
        double ri = scanner.nextDouble();

        System.out.print("Enter the radius of the outer circle (ro): ");
        double ro = scanner.nextDouble();


        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);


        double innerArea = innerCircle.computeArea();
        double outerArea = outerCircle.computeArea();


        double circularRegionArea = outerArea - innerArea;


        System.out.printf("The area of the circular region is: %.2f%n", circularRegionArea);


        scanner.close();
    }
}
