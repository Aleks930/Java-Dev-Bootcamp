import java.util.Arrays;

public class TDarrays {
  public static void main(String[] args) {
    int[][] grades = { { 72, 74, 78, 76 }, { 65, 64, 61, 67 }, { 95, 98, 99, 100 } };
    System.out.println("\tHarry:    " + grades[0][0] + " " + grades[0][1] + " " + grades[0][2] + " " + grades[0][3]);
    System.out.println("\tRon:      " + Arrays.toString(grades[1]));
    System.out.println("\tHermione: " + Arrays.toString(grades[2]));
  }
}
