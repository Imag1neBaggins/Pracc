/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ramanujan2;
import java.util.*;
/**
 *
 * @author User
 */
public class Ramanujan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int a,b,c,d;
        int a3,b3,c3,d3;
        int sum1, sum2;
        int Rnumbers = 0;
        
        
        for (a = 1; a<(int)Math.cbrt(number); a++) { //Initialising a and keeping it lesser than the cube root of the number input
            
            a3 = a*a*a;
            for (b = a+1; b<(int)Math.cbrt(number); b++) {  //Initialising b with a+1 to make sure no duplication occurs
                
                b3 = b*b*b;
                for (c = a+1; c<(int)Math.cbrt(number); c++) {
                    
                    c3 = c*c*c;
                    for (d = c; d<(int)Math.cbrt(number); d++) {
                        
                        d3 = d*d*d;
                        sum1 = a3 + b3;
                        sum2 = c3 + d3;
                        
                        if (a3 != b3 && a3 != c3 && a3 != b3 && b3 != c3 && b3 != d3 && c3 != d3) {  //Checking to make sure we don't get faulty numbers where both sides have the same numbers
                            if (sum1 == sum2 && sum1 == number) {
                            System.out.println();
                            System.out.println("The number you entered, is a Ramanujan Taxicab number!");
                            System.out.println(sum1 + "= " + a3 + "+" + b3 + " = " + c3 + "+" +d3);
                            Rnumbers++;
                         }   else if (sum1 == sum2 && sum1<number) {
                            System.out.println();
                            System.out.println(sum1 + " is a Ramanujan Taxicab number!");
                            System.out.println(sum1 + "= " + a3 + "+" + b3 + " = " + c3 + "+" +d3);
                            Rnumbers++;
                            }
                        }
                    }
                }
            }
        }
                if (Rnumbers == 0) {   //Checking if any number was found
            System.out.println();
            System.out.println("No Ramanujan's numbers exist between 0 and your number");
        }
    }
    
}
