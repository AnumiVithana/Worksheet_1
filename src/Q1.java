import java.util.Scanner;

public class Q1 {

public static void main(String[] args) {
    Scanner number = new Scanner(System.in);
    System.out.println("Enter a odd length word: ");
    String word = number.nextLine();


    if (word.length() % 2 == 0) {
        System.out.println("Word length is even.");
    }else{
        System.out.println("The middle character is: "+word.charAt(word.length()/2));
    }
}

}
