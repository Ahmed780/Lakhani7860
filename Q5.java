import java.util.Scanner;
public class Q5 {
 public static void main(String args[]) {
  int min = 0;
  int max = 101;
  //Generates a random number from 0-100 
  
  System.out.println("Random number is");
  int random = (int) Math.round((Math.random()) * (max - min));
  
  System.out.println(random);

  //Uses the random number and preforms different functions
  
  System.out.println(Math.round(Math.sqrt(random)));
  System.out.println(Math.round(Math.pow(random, 2)));
  System.out.println(Math.round(Math.pow(random, 3)));
  System.out.println(Math.round(Math.log(random)));
  System.out.println(Math.round(Math.log10(random)));

 }


}