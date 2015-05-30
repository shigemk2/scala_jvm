object FactorialScala {
  def fact(n: Int): Int = n match {
    case 0 => 1
    case n if n > 0 => n * fact(n - 1)
  }

  def main(args: Array[String]) :Unit = {
    fact(5)
  }
}
