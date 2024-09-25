public class Removeleadingzero {
 public static void main(String[] args) {
    String s="00001234567890";
    String a="^0+";
    System.out.println(s.replaceAll(a,""));
 }   
}
