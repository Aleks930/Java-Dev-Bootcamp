import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");

        //Task 1 - Using Scanner, ask the user questions

        System.out.println("\nWhat is your first name?");
        String firstName = scan.nextLine();
        //Ask for their first name.
        System.out.println("\nWhat is your last name?");
        String lastName = scan.nextLine();
        //Ask for their last name.
        System.out.println("\nHow old are you?");
        int age = scan.nextInt();
        String throwaway = scan.nextLine();
        //Ask: how old are you?
        System.out.println("\nPlease enter an username:");
        String username = scan.nextLine();
        //Ask them to make a username.
        System.out.println("\nWhat city are you currently living in?");
        String city = scan.nextLine();
        //Ask what city they live in.
        System.out.println("\nWhich country is located that city?");
        String country = scan.nextLine();
        //Ask what country that's from.


        //Task 2 - Print their information.

        System.out.println("\nThank you for joining JavaGram!");

        //Print their information like so:
        System.out.println("\nHere is the information you entered:");
        // Your information:
        System.out.println("\tFirst name: " + firstName);
        //        First Name: Rayan
        System.out.println("\tLast name: " + lastName);
        //        Last Name: Slim
        System.out.println("\tAge: " + age);
        //        Age: 27
        System.out.println("\tUsername: " + username);
        //        Username: monotonic_relu
        System.out.println("\tCity: " + city);
        //        City: Ottawa
        System.out.println("\tCountry: " + country);
        //        Country: Canada
        //
        scan.close();


        //close scanner. It's good practice :D !
    }
}
