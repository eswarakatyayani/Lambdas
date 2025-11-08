public class StaticMethodReference {
  public static void printer(String s){
  System.out.println(s);
}
  public class Main{
    public static void main(String args[])
    {
      Consumer<String> print=StaticMethodReference::printer;
      print.accept("Hello Katy");
      
    }
  }
