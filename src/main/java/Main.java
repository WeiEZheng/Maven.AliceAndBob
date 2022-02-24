import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        Main names = new Main();
        System.out.println("Enter your first name:");
        String name = scan.nextLine(); //get name from input
        names.AliceAndBob(name);
        scan.close();
    }
    public void AliceAndBob(String name){
        //checks if their name is bob or alice
        if (name.equalsIgnoreCase("bob"))
            System.out.println("Greetings "+name+".");
        else if (name.equalsIgnoreCase("alice"))
            System.out.println("Greetings "+name+".");
    }
}
