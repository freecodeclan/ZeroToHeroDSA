package MasterYourBasics;

public class reverseTheDigit {
  public static void main(String[] args) {
    int n = 5432;
    System.out.println("The n values to be reversed are : " + n);
    int ans = 0;
    while (n > 0) {
      ans = ans * 10 + n % 10;
      n = n / 10;
    }
    System.out.print("The reverse order of n values is : " + ans);
    
  }
}
