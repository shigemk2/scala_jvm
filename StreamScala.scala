object StreamScala {
  def main(args: Array[String]) :Unit = {
    val a = Stream.from(1).take(3).toList
  }
}
