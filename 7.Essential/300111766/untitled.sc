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
Test7.simplefield
Test7.noParameterMethod
Test7.noParameterMethod

