/* 
Name: Rachel Shindelus
Due: 09/25/2022 (Module 4)
Purpose: This program is designed to convert Chinese Yuan to US Dollars, called "The Coin Converter." It converts Yuan to any of the US coins, as well as to the dollar amount that the Yuan is worth. 
Self Grade: I believe I should receive 100% as this program fulfills every requirement of the assignment and executes the code properly. 
*/

public class CoinConverterShindelus{
   // Calls to the two methods of description() and convert() to produce a program that describes it's purpose and properly outputs the results of the conversion of yuan to dollars. 
   public static void main(String[] args)
   {
      description();
      convert();
   }
   /* Prints the description of the program. */
   public static void description()
   {
      System.out.println("************************************************************************************");
      System.out.println("*\t\t\t\t\t\t\t\t\tWELCOME TO THE COIN CONVERTER!\t\t\t\t\t\t\t\t  *");
      System.out.println("*\t$\t$\t$\t$\t$\t$\t$\t$\t$\t$\t$\t$\t$\t$\t$\t$\t$\t$\t$\t$\t$\t$\t$\t$\t$\t$\t$ *");
      System.out.println("*\t\t\t\t\t\tI can convert the number of Pennies you have\t\t\t\t\t\t\t  *");
      System.out.println("*\tto the number of Dollar Bills, Quarters, Dimes, Nickles, and Pennies you have!  *");
      System.out.println("************************************************************************************");
      System.out.println(" ");
   }
   /* Contains the necesary conversion functions and produces the output of yuan to US dollars. */
   public static void convert()
   {
       int yuan = 3456;       // The initalization of the amount of yuan (change here to alter the results of code)
       
       // Converts yuan to each individual payment represnted by a single type(based using the initial yuan to dollar conversion).
       double dollars = yuan * 0.14;         // Conversion of yuan to dollars
       double quarters = dollars / 0.25;     // Conversion of dollars to quarters
       double dimes = dollars / 0.1;         // Conversion of dollars to dimes
       double nickles = dollars / 0.05;      // Conversion of dollars to nickles
       double pennies = dollars / 0.01;      // Conversion of dollares to pennies
       
       // Prints the results of the functions
       System.out.println(" The value of yuan converted to each American currency method: ");
       System.out.print(" Yuan = " + yuan + "\n Dollares= " + (int)dollars);
       System.out.print("\n Quarters= " + (int)quarters);
       System.out.print("\n Dimes= " + (int)dimes);
       System.out.print("\n Nickles= " + (int)nickles);
       System.out.println("\n Pennies= " + (int)pennies);
       System.out.println(" ");
      
      // Converts yuan to the equivalent amount of money available to spend (based off of the initial yuan to pennies conversion.
       pennies = (double)(yuan * .14) * 100;       // Conversion of yuan to pennies     
       dollars = pennies / 100;                    // Conversion of pennies to dollars
       pennies = pennies % 100;                    // Find the remainder amount of pennies from whole dollars
       quarters = pennies / 25;                    // Conversion of pennies to quarters
       pennies = pennies % 25;                     // Find the remainder amount of pennies from whole quarters
       dimes = pennies / 10;                       // Conversion of pennies to dimes
       pennies = pennies % 10;                     // Find the remainder amount of pennies from whole dimes
       nickles = pennies / 5;                      // Conversion of pennies to nickles
       pennies = pennies % 5;                      // Find the remaining amount of pennies from whole nickles
       
       // Prints the results of the functions
       System.out.println("OR: \nThe value of Yuan converted to US dollar amount: ");
       System.out.println("If you have " + yuan + " Yuan, then you have " + (int)dollars + " Dollar Bills, ");
       System.out.print((int)quarters + " Quarters, " + (int)dimes + " Dimes, ");
       System.out.println((int)nickles + " Nickles, and " + (int)pennies + " Pennies to spend.");
     }
    }