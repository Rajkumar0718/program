public class SumOddAndEven {
  public static int sum(int[] arr,String count){
    int oddCount = 0;
    int evenCount = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        evenCount =evenCount+arr[i];
      } else if (arr[i] % 2 != 0) {
        oddCount=oddCount+arr[i];
      }
    }
    return count.equals("evenCount") ? evenCount : count.equals("oddCount") ? oddCount : null;
  }
  public static void main(String[] args) {
    System.out.println(sum(new int[]{1,2,3,4,5}, "evenCount"));
    System.out.println(sum(new int[]{1,2,3,4,5}, "oddCount"));
  }
}
