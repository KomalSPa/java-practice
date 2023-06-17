package morningchallenge;

import java.util.Scanner;

/**
 * Created by Jay Vaghani
 */
public class Challenge1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your name :");
        String name =  scanner.nextLine();
        System.out.println("Please Enter greetings message :");
        String message = scanner.nextLine();
        System.out.println("Hi " + name);
        System.out.println(message);
        scanner.close();
    }
}
