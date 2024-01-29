/*  Count the number of Digits for a given number n */

package MasterYourBasics;

import java.util.Scanner;

public class countDigits {

  public static void main(String[] args) {
     //--Taking input from User 
     Scanner sc = new Scanner(System.in);
     System.out.print("Please enter the elements :");
     System.out.println();
     
     int n = sc.nextInt();
     int numOfCounts = 0;
 
     while (n > 0) {
       n = n / 10;
       numOfCounts++;
     }
     System.out.print("The number of elements entered by user are : " + numOfCounts);
  }
}