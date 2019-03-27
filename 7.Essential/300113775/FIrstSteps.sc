
object FirstSteps {
  println("Bienvenue sur la page de travail scala")

  if (20>10) "left" else "right"

  println("la meilleure reponse est " + 42)
}

object Test2 {
  def name: String = " Probably the best object ever "
}
Test2.name


object Test3 {
  def hello(name: String): String = " Hello " + name
}
Test3.hello(name = "Adk")


object Test4 {
  val name = "Armand Widby "
  def hello(other: String): String =
    name + "says bye to " + other
}
Test4.hello(other = "Scala")

object Test7 {
  val simplified = {
    println("Evaluating simpleField")
    42
  }
  def noParameterMethod = {
    println("Evaluating noParameterMethod")
    42
  }
}
Test7.simplified
Test7.simplified
Test7.noParameterMethod
Test7.noParameterMethod

object Oswald {
  val colour = "Black"
  val food = "Milk"
}
Oswald.colour
Oswald.food

object Henderson {
  val colour = "Ginger"
  val food = "Chips"
}
Henderson.colour
Henderson.food

object Quentin {
  val colour = "Blanc"
  val food = "Curry"
}
Quentin.colour
Quentin.food

def square(in: Double): Double = in * in
assert(square (in =2.0) == 4.0)