import java.io.PrintStream;

public class FactorialTAJava
{
  public static int fact(int paramInt)
  {
    return go(paramInt, 1);
  }
  
  private static int go(int paramInt1, int paramInt2)
  {
    if (paramInt1 <= 0) {
      return paramInt2;
    }
    return go(paramInt1 - 1, paramInt1 * paramInt2);
  }
  
  public static void main(String[] paramArrayOfString)
  {
    System.out.println(fact(5));
  }
}
