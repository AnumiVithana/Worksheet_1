import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String[] fullName = new String[3];

        System.out.println("Enter your first name : ");
        fullName[0]=scanner.nextLine();

        System.out.println("Enter your middle name : ");
        fullName[1]=scanner.nextLine();

        System.out.println("Enter your last name : ");
        fullName[2]=scanner.nextLine();

        String newName = fullName[2]+","+fullName[0]+" "+fullName[1].charAt(0)+".";
        System.out.println(newName);

    }
}
