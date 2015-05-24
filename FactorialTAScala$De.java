import scala.Predef.;
import scala.runtime.BoxesRunTime;

public final class FactorialTAScala$
{
  public static final  MODULE$;
  
  static
  {
    new ();
  }
  
  public int fact(int n)
  {
    return go(n, 1);
  }
  
  private int go(int n, int acc)
  {
    for (;;)
    {
      if (n <= 0) {
        return 
          acc;
      }
      acc = n * acc;n -= 1;
    }
  }
  
  public void main(String[] args)
  {
    Predef..MODULE$.println(BoxesRunTime.boxToInteger(fact(5)));
  }
  
  private FactorialTAScala$()
  {
    MODULE$ = this;
  }
}
