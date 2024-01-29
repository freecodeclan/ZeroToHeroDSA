package MasterYourBasics;

import java.util.Scanner;

public class sumOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the element: ");
    int n = sc.nextInt();

    int sumAns = 0;
    while (n > 0) {
      sumAns += n % 10;
      n = n / 10;
    }
    System.out.println("The sum of Elements is: " + sumAns);
  }
}
12345