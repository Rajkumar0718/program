package program;

public class CheckOddorEven {
  public static void checkOddEven(int num){
    if(num%2==0){
      System.out.println("It is even number");
    }else if(num%2!=0){
      System.out.println("It is a odd number");
    }
  }
  public static void main(String[] args) {
    checkOddEven(1);
  }
}
