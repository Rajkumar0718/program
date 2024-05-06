import java.util.Arrays;

public class SperateOddAndEven {
  public static int[] seprateEven(int[] arr) {
    int[] temp = new int[arr.length];
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        temp[count] = arr[i];
        count++;
      }
    }
    return temp;
  }

  public static int[] separateOdd(int[] arr) {
    int[] temp = new int[arr.length];
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        temp[count] = arr[i];
        count++;
      }
    }
    return temp;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(seprateEven(new int[] { 1, 2, 3, 4, 5, 6 })));
    System.out.println(separateOdd(new int[] { 1, 2, 3, 4, 5, 6, 7 }));
  }
}
