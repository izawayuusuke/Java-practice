public class RegExp {
  public static void main(String[] args) {
    String str = "abc111def222ghi333a";
    str = str.replaceAll("[a-z]+", "0");

    System.out.println(str);
  }
}
