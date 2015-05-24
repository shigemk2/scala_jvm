object FactorialIfScala {
  def fact(n: Int): Int = {
    if (n <= 0) {
      return 1
    } else {
      return n * fact(n - 1)
    }
  }

  def main(args: Array[String]) :Unit = {
    println(fact(5))
  }
}
