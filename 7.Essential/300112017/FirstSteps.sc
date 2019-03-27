object FirstSteps {
  println("Welcome to the Scala worksheet")
  1+1
  if(20 > 10) "left" else "right"
  println("The ultimate answer is " + 42)
}

object Test2 {
  def name: String = "Probably the best object ever"
}

Test2.name
// res1: String = Probably the best object ever

object Test3 {
  def hello(name: String)=
    "Hello " + name
}
Test3.hello("Noel")
// res2: String = Hello Noel

object Test4 {
  val name = "Noel"
  def hello(other: String): String =
    name + " says hi to " + other
}
Test4.hello("Dave")
// res3: String = Noel says hi to Dave

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
object Quentin {

  val couleur = "blanc"
  val food = "curry"
}
Quentin.food

def square(in: Double): Double = in * in
assert(square(2.0)== 4.0)
def entreesortie(mot: string)