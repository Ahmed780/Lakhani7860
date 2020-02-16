import java.util.*;

// This Program verifies if the URL is valid and secure or not.
public class Q4 {
 public static void main(String[] args) {
  int stringLength;
  Scanner scanner = new Scanner(System.in);
  String http = "https://"; //Pattern to Compare
  boolean match;

  System.out.println("\n*****This program verifies whether a given URL is Valid or Not?*****");
  
  System.out.println("Enter the URL");
  String url = scanner.nextLine();
  //Asks user for URL
  
  stringLength = url.length();
  System.out.println("Verifying an URL with " + stringLength + " characters...");
  
  match = (url.regionMatches(0, http, 0, 8));
  //To check if the URL is valid or not.
  if (match) {
   System.out.println("Is this a valid and secure URL? " + match + ".");
  } else {
   System.out.println("Is this a valid and secure URL? " + match + ".");
  }

 }

}