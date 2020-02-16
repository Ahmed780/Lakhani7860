import java.util.Scanner;

public class Q3 {
 public static void main(String args[]) {
  int num, rem = 0, sum = 0, temp;
  
  Scanner digits = new Scanner(System.in);

  System.out.print("type a whole number of 3 digits");
  // asks the user for a whole number if 3 digits
  
  num = digits.nextInt();
  
  temp = num;

  while (num > 0) {
   rem = num % 10;
   sum = sum + rem;
   num = num / 10;
   // uses bolean (while) to add 3 digits and print the result
  }

  System.out.print("The sum of digits is " + sum);
  // outputs the sum of 3 digits in the same line
 }
}