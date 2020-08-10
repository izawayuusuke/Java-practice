public class ReturnArray {
  public static int[] addArray(int x, int y) {
    int[] array = new int[2];
    array[0] = x;
    array[1] = y;
    return array;
  }

  public static void main(String[] args) {
    int[] array = addArray(100, 200);
    for (int all : array) {
      System.out.println(all);
    }
  }
}
