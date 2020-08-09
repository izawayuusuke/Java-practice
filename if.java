public class IF {
  public static void main(String[] args) {
    int time = 18;
    // System.out.print("只今の時刻は" + time + "時です。");
    // System.out.print("おはようございます。");
    if ((time >= 4) && (time <= 10)) {
      System.out.print("只今の時刻は" + time + "時です。");
      System.out.print("おはようございます。");
    } else if ((time >= 11) && (time <= 17)) {
      System.out.print("只今の時刻は" + time + "時です。");
      System.out.print("こんにちは");
    } else if ((time == 18)) {
      System.out.print("只今の時刻は" + time + "時です。");
      System.out.print("こんばんは");
    } else if ((time >= 19 && time <= 24) || (time >= 0 && time <= 3)) {
      System.out.print("只今の時刻は" + time + "時です。");
      System.out.print("おやすみなさい");
    }
  }
}
