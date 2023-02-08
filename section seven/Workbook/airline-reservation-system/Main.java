public class Main {
  
    public static void main(String[] args) {
        Person rayan = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);
        rayan.setSeatNumber(10);

        System.out.println("Name: " + rayan.getName() + "\n" 
        +                  "Nationality: " + rayan.getNationality() + "\n" 
        +                  "Date of birth: " + rayan.getDateOfBirth() + "\n" 
        +                  "Seat number: " + rayan.getSeatNumber() + "\n");

    }
  
  
}
