import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {
        Person rayan = new Person();

        rayan.name = "Rayan Slim";
        rayan.nationality = "Canadian";
        rayan.dateOfBirth = "01/01/1111";
        rayan.passport = new String[]{rayan.name, rayan.nationality, rayan.dateOfBirth};
        rayan.seatNumber = 5;

        System.out.println(rayan.name);
        System.out.println(rayan.nationality);
        System.out.println(rayan.dateOfBirth);
        System.out.println(Arrays.toString(rayan.passport));
        System.out.println(rayan.seatNumber);


    }
  
  
}
