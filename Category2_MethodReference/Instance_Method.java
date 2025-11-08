

   public class Main{
  public static void main(String args[])
  {
Function<String,Integer> a=Integer::parseInt;
   System.out.println( a.apply("5"));
  }}
