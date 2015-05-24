import scala.Predef.;
import scala.runtime.BoxesRunTime;

public final class FactorialIfScala$
{
  public static final  MODULE$;
  
  static
  {
    new ();
  }
  
  public int fact(int n)
  {
    if (n <= 0) {
      return 1;
    }
    return n * fact(n - 1);
  }
  
  public void main(String[] args)
  {
    Predef..MODULE$.println(BoxesRunTime.boxToInteger(fact(5)));
  }
  
  private FactorialIfScala$()
  {
    MODULE$ = this;
  }
}
