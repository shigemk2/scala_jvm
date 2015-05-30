trait Trait {
  def method(a:String, b:String): String
}
class TraitScala extends Trait {
  def method(a:String, b:String): String = {
    a + b
  }
}
object TraitScala {
  def main(args: Array[String]) :Unit = {
    val a = new TraitScala()
  }
}
