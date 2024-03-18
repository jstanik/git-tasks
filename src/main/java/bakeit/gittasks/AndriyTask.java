package bakeit.gittasks;

public class AndriyTask {

  public static int GreatestCommonDivisor(int a, int b) {
    // Ensure that b is not greater than a
    if (b > a) {
      int temp = a;
      a = b;
      b = temp;
    }

    // Apply the Euclidean algorithm
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }

    return a;
  }

  public static void main(String[] args) {
    int a = 1902;
    int b = 33;
    int gcd = GreatestCommonDivisor(a, b);
    System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
  }
}