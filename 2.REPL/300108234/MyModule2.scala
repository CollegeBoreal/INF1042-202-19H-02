object abs {
  def abs (n : Int): Int =
     if (n < 0 )  -n
     else n 

  private def formatabs(x : Int)= {
     val msg = "la valeur absolue de %d est %d" 
     msg.format(x, abs(x))
 }
  

  def main(args: Array[String]): Unit = {
 
     println(formatabs(-2)) 

 }



}
