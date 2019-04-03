object FirstSteps {
  println("Welcome to the Scala worksheet")

  1 + 1

  if (20 > 10) "left" else "right"
  println("The ultimate answer is " + 42)
}
object Test2 {
  def name: String = "Probably the best object ever "
}
Test2.name

object Test3 {
  def hello(name: String) = "Hello " + name
}
Test3.hello("Cheikh")

object Test4 {
  val name = "Noel"
  def hello(other: String): String =
    name + " says hi to " + other
}
Test4.hello("Cheikh")

object Test7 {
  val simplefield = {
    println("Evaluating  simpleField")
    42
  }
  def noParameterMethod = {println("evaluating no ParameterMethod")
  42
  }
}
Test7.simplefield
Test7.noParameterMethod


object Oswald{
  val colour: String = "Black"
  val food: String = "Milk"

}

object Hederson{

  val colour: String = "Ginger"
  val food: String = "Chips"

}

object Quetin {

  val colour = "Tabby and white"
  val food = "curry"
}


def square(in: Double): Double = in * in
assert(square(2.0)==4.0)
def entreeSortie(mot: String)

