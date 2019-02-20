object MyModule {
  def abs (n : Int ): Int =
    if (n < 0) -n
    else n

  def factorial (n: Int) : Int = {
    def go(n: Int, acc: Int ): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)
    go(n, 1)

 }

  private def formatAbs(x: Int) = {
    val msg = "La valeur absolue de  %d est %d"
    msg.format (x, abs (x))
  }
  
  private def formatFactorial (n: Int) = {
    val msg = "The factoriel of %d is %d."
    msg.format (n, factorial(n))
 }

  def main(args: Array[String]) : Unit = {
    println(formatAbs(-42))
    println(formatFactorial(7))
  }
}
