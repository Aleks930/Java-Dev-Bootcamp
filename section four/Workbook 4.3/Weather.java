public class Weather {
    public static void main(String[] args) {
        double noon = fahrenheitToCelsius(77);          //temperature at noon in fahrenheit.
        double evening = fahrenheitToCelsius(61);       //temperature during the evening in fahrenheit
        double midnight = fahrenheitToCelsius(55);      //temperature at midnight in fahrenheit

        //Task 3 - Call the printTemperatures function.
        printTemperatures(77, noon);
        printTemperatures(61, evening);
        printTemperatures(55, midnight);
    }

    //Task 1: Make a function here. See the doc comments below.

    /**
     * Function name: fahrenheitToCelsius - converts fahrenheit to celcius
     * @param fahrenheit (double)
     * @return celsius (double)
     *
     * Inside the function:
     * 1. returns the temperature in celcius. C = (F - 32) * 5/9.
     */
     public static double fahrenheitToCelsius(double fahrenheit) {
       double celsius = (fahrenheit - 32) * 5/9;
       return celsius;
     }

    //Task 2: Make a function here. See the doc comments below.

    /**
     * Function name: printTemperatures – prints both temperature values.
     * @param fahrenheit (double)
     *
     * Inside the function:
     *  1. prints: F: <temperature in fahrenheit>.
     *  2. prints: C: <temperature in celsius> .
     */
     public static void printTemperatures(double fahrenheit, double celsius) {
       System.out.println("The temperature in F is: " + fahrenheit);
       System.out.println("The temperature in C is: " + celsius + "\n");
     }
}