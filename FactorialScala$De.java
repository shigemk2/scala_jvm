import scala.MatchError;
import scala.Predef.;
import scala.runtime.BoxesRunTime;

public final class FactorialScala$
{
  public static final  MODULE$;
  
  static
  {
    new ();
  }
  
  public int fact(int n)
  {
    int i = n;
    switch (i)
    {
    default: 
      throw new MatchError(BoxesRunTime.boxToInteger(i));
    }
    return 
    
      i > 0 ? i * fact(i - 1) : 1;
  }
  
  public void main(String[] args)
  {
    Predef..MODULE$.println(BoxesRunTime.boxToInteger(fact(5)));
  }
  
  private FactorialScala$()
  {
    MODULE$ = this;
  }
}
