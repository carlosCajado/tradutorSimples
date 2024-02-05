public class Main {

  // public static void main(String[] args) {
  // String input = "289-85+0+69";
  // Scanner scan = new Scanner(input.getBytes());
  // System.out.println(scan.nextToken());
  // System.out.println(scan.nextToken());
  // System.out.println(scan.nextToken());
  // System.out.println(scan.nextToken());
  // System.out.println(scan.nextToken());
  // System.out.println(scan.nextToken());
  // System.out.println(scan.nextToken());
  // }
  public static void main(String[] args) {
    String input = """
        let a = 42 + 5 - 8;
        let b = 56 + 8;
        print a + b + 6;""";

    Parser p = new Parser(input.getBytes());
    p.parse();
  }
}