import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {
              //Task 1 – Scan for the nextLine(), and print it 99 times.
      Scanner scan = new Scanner(System.in);
      System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
      String line = scan.nextLine();

      for (int i = 1; i < 100; i++) {
        System.out.println(i + ". " + line);
      }
      scan.close();

    }
}