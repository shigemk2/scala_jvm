import scala.Predef.;
import scala.runtime.BoxesRunTime;

public final class PlusScala$
{
  public static final  MODULE$;
  
  static
  {
    new ();
  }
  
  public void main(String[] args)
  {
    int a = 1;
    a += 2;
    Predef..MODULE$.println(BoxesRunTime.boxToInteger(a));
  }
  
  private PlusScala$()
  {
    MODULE$ = this;
  }
}
