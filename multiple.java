public class multiple {
  public static void main(String[] args) {
    System.out.println(isMultipleOf3(123456789));
  }

  public static String isMultipleOf3(int n) {
    String resultMessage = "";
    if (n % 3 == 0) {
      resultMessage = n + "は3で割り切れます。";
    } else {
      resultMessage = n + "は3で割り切れません。";
    }
    return resultMessage;
  }
}
