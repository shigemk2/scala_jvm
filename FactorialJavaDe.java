import java.io.PrintStream;

public class FactorialJava
{
  public static int fact(int paramInt)
  {
    if (paramInt <= 0) {
      return 1;
    }
    return paramInt * fact(paramInt - 1);
  }
  
  public static void main(String[] paramArrayOfString)
  {
    System.out.println(fact(5));
  }
}
