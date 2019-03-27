import example.Hello

object FirstSteps {
  println("Welcome to the Scala worksheet")
  1 + 1
  if (20 > 10) "left" else "right"
  println("The ultimate answer is " + 42)
}

object Test2 {
  def name: String = " probably the best object ever "
}
Test2.name
object Test3 {
  def hello(name: String)= "Hello " + name
}
Test3.hello (name= "AEK")

object Test4 {
  val name = "AEK"
  def hello(other: String): String =
    name + " says hi to " + other
}
object Test7 {
  val simpleField = {
    println("Evaluating simpleField")
    42
  }
  def noParameterMethod = {
    println("Evaluating noParameterMethod")
    42
  }
}
Test7.simpleField
Test7.simpleField
Test7.noParameterMethod
Test7.noParameterMethod

object Oswald {


}
object Henderson {

}
object Quetin {

val couleur = "blanc"
val food = "curry"
}
Quetin.food

def square(in: Double): Double =  in * in
  assert(square(in = 2.0 )  == 4.0 )
{1, 2, 3}

