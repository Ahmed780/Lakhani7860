import java.util.Scanner;

public class Q1 {
 // this program calculates the cost of the roadtrip
 public static void main(String[] args) {


  Scanner K = new Scanner(System.in);

  System.out.println("How many kilometers will you travel? ");
  // distance to be travelled

  double kilo = K.nextDouble();

  Scanner D = new Scanner(System.in);

  System.out.println("what is the average distance that the vehicle runs with 1 liter of gas? ");
  // average distance with 1 liter 

  double dist = D.nextDouble();

  double p = 1.16;

  double cash = Math.round(kilo / dist) * p;

  System.out.println("the total amount for the roadtrip is " + cash + "$");
  // calculates the cost of the roadtrip
 }

}