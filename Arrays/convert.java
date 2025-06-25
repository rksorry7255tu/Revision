public class convert {
  public static void main(String[] args) {
    // integer to string
    int a = 20;
    String b = String.valueOf(a);
    System.out.println(b);

    // string to integer
    String c = "20";
    int d = Integer.valueOf(c);
    System.out.println(d);

    // string to charArray
    String name = "ravi";
    char arr[] = name.toCharArray();
    System.out.println(arr);

    // charArray to String
    // char arr[] = { 'a', 'b', 'c', 'd' };
    String ans = new String(arr);
    System.out.println(ans);

    // int a = 10;
    Integer integerObject = Integer.valueOf(a);
    System.out.println(integerObject.getClass().getName());

    // String name = "Ravi";
    System.out.println(name.getClass().getName());

  }
}
