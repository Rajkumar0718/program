public class ReverseTheNum {
  public static int reverse(int arr) {
    int reverse = 0;
    while (arr > 0) {
      int temp = arr % 10; // first want store the reminder in temp variable
      reverse = (reverse * 10) + temp; // next want store reverse variable (want mulitiple reverse into 10) and add the
                                       // temp
      arr = arr / 10; // for next irteration we to give Quotient
    }
    return reverse;
  }

  public static void main(String[] args) {
    System.out.println(reverse(2345));
  }
}
