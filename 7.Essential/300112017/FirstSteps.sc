object FirstSteps {
  println("Welcome to the Scala Worksheet")

  if (20>10) "left" else "right"

  println("The ultimate answer is " + 42)
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
  val name = "Noel "
  def hello(other: String): String =
    name + "says hi to " + other
}
Test4.hello(other = "Dave")

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
