object FirstSteps {
  println("Welcome to the Scala worksheet")

  1 + 1

  if(20 > 10) "left" else "right"
  println("The ultimate answer is " + 42)
}

object Test2 {
  def name: String = "Probably the best object ever"
}

object Test4 {
  val name = "Noel"
  def hello(other: String): String =
    name + "says hi to" + other
}

Test4.hello("Dave")

object Test7 {
  Val simpleField = {

    println("Evaluating simpleField")
    42

  }
  def noParameterMethod = {println("evaluating no ParameterMethod")
    42
  }

}

Test7.simpleField
Test7.simpleField
Test7.noParameterMethod
Test7.noParameterMethod