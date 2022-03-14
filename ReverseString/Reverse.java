public class Reverse {


 public static void main(String[] args) {
//  String input = "hello very beautiful world";
//  String output = "world beautiful very hello";
//
//  String reverse = reverseWords(input);
//  if(output.equals(reverse)){
//    System.out.println("Problem solved!");
//  }
//
// }
//
// static String reverseWords(String input){
//    System.out.println(reverseWord("hello very beautiful world"));
// //TODO implementation
// }
  String input = reverse("hello very beautiful world");
  System.out.println(input);

 }

 public static String reverse(String s)  {
   char [] letters = new char[s.length()];

   int letterIndex = 0;
   for (int i = s.length() - 1; i >= 0; i--) {
     letters[letterIndex] = s.charAt(i);
     letterIndex++;
   }
   String reverse = "";
   for (int i = 0; i < s.length(); i++) {
     reverse = reverse + letters[i];
   }

   return reverse;
 }

}
