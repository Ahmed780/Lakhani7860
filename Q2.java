import java.util.Scanner;

public class Q2 {

 public static void main(String[] args) {
  double tps, tvq, tips;
  double Price;
  double Total;
  
  double Tps = 0.05;
  double Tvq = 0.09;
  double Tip = 0.015;
  // sales tax and tips in Quebec
  
  Scanner c = new Scanner(System.in);

  System.out.println("type the price of a product in CAD");
  // asks the user for the price of a product

  Price = c.nextDouble();
  tps = (Tps * Price) ;
  tvq = (Tvq * Price) ;
  tips = (Tip * Price) ;

  Total = Price + tps + tvq + tips;
  // calculates the final price with taxes+tips

  System.out.println("Sales tax in Quebec = TPS + TVQ + 15% ");
  // displays sales tax in Quebec

  System.out.printf("\n          ------------------------");
  System.out.printf("\n          -1 Product        $%.2f ", Price);
  System.out.printf("\n          -2  T.P.S         $%.2f ", tps);
  System.out.printf("\n          -3  Tips          $%.2f ", tips);
  System.out.printf("\n          -4  T.V.Q         $%.2f ", tvq);
  System.out.printf("\n              Total         $%.2f ", Total);
  System.out.printf("\n          ------------------------");
  // outputs the final price including taxes and tips (like a bill) 


 }

}