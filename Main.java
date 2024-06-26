import java.util.Scanner;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Hello, Welcome to the Simple Interest Calculator");
// ask for P input
    System.out.println("Please enter in a Principle value: ");
    int P = sc.nextInt();

// ask for R input
    System.out.println("Please enter in a Rate value: ");
    int R = sc.nextInt();

// ask for T input
    System.out.println("Please enter in a Time value: ");
    int T = sc.nextInt();

// calculate the SI:
    int SI = (P * T * R) / 100;
// print out the SI:
    System.out.println("The Simple Interest is: " + SI);
  }
}
