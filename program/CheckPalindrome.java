public class CheckPalindrome {
  public static String palindrome(int number) {
    int tempnum = number;
    int reverse = 0;
    while (number > 0) {
      int temp = number % 10;
      reverse = (reverse * 10) + temp;
      number = number / 10;
    }
    return reverse == tempnum ? "It is palindrome" : "It is not Palindrome";
  }

  public static void main(String[] args) {
    System.out.println(palindrome(121));
  }
}
