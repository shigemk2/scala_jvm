import scala.annotation.tailrec

object FactorialTAScala {
  def fact(n: Int): Int = {
    @tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)
    go(n, 1)
  }

  def main(args: Array[String]) :Unit = {
    fact(1000000)
  }
}
