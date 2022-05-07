/* 
Name:Elizabeth Pursell
Date: 2/4/2022
CSE 007 Spring 2022: Lab 2
Produce PhoneNumber program that will use the modulus operator in order to reformat a phone number as a string
IDE Used: Visual Studio Code
*/
import java.util.Scanner;
public class PhoneNumber {
    public static void main(String[] args){
        //initiate variables
        long phoneNumber;
        long lineNumber;
        long prefix;

        //create scanner to get user input
        Scanner scan = new Scanner(System.in);

        //get user input
        System.out.print("Enter a 10 Digit Phone Number: ");
        phoneNumber = scan.nextLong();

        //format phone number and print
        lineNumber = phoneNumber % 10000;           //get 4 rightmost digits
        phoneNumber /= 10000;           //remove last 4 digits
        prefix = phoneNumber % 1000;        //get 3 rightmost digits after removal
        phoneNumber /= 1000;            //remove last 3 digits, leaving area code
        System.out.println("Formatted Phone Number: (" + phoneNumber + ") " + prefix + "-" + lineNumber);
    }
}
