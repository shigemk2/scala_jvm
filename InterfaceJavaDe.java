import java.io.PrintStream;

public class InterfaceJava
  implements Interface
{
  public String method(String paramString1, String paramString2)
  {
    return paramString1 + paramString2;
  }
  
  public static void main(String[] paramArrayOfString)
  {
    InterfaceJava localInterfaceJava = new InterfaceJava();
    System.out.println(localInterfaceJava.method("a", "b"));
  }
}
