public class CountGivenNum {
  public static int count(int num) {
    int temp = 0;
    while (num > 0) {
      temp++;
      num = num / 10;
    }
    return temp;
  }

  public static void main(String[] args) {
    System.out.println(count(1234533333));
  }
}
