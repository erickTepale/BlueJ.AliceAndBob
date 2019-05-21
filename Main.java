/**
 * Created by iyasuwatts on 10/17/17.
 * Edited Erick Tepale
 * Asks user for name, Greets user if name is Alice or Bob
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your name?");
        
        String userName = input.nextLine();
        
        if(userName.equals("Alice") || userName.equals("alice") ||
           userName.equals("Bob") || userName.equals("bob") )
        {
            System.out.println("Hi " + userName + " (: ");
        }else {
            System.out.println("Unknown User");
        }
    }
}
