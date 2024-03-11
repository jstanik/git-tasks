package bakeit.gittasks;

public class DavidTask {

  /**
   * Find the greatest common divisor (GCD) of the integers {@code a} and {@code b}.
   * <p>
   * In mathematics, the greatest common divisor (GCD) of two or more integers, which are not all
   * zero, is the largest positive integer that divides each of the integers.
   * </p>
   *
   * @return the greatest common divisor of the two integers.
   */
  public int greatestCommonDivisor(int a, int b) {
    //throw new UnsupportedOperationException();
    if (b == 0) {
      return a;
    }
    return greatestCommonDivisor(b, a % b);
  }

}