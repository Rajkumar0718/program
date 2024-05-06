public class Factorial {
  public static int factorial(int num) {
    int factorial = 1;
    while (num > 0) {
      factorial = factorial * num;
      num--;
    }
    return factorial;
  }
  public static void main(String[] args) {
    System.out.println(factorial(5));
  }
}
