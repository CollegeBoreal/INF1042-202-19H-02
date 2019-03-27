1 + 1
object Firststeps {
  println("welcome to scala worksheet")

  1 + 1

  if(20 > 10) "left" else "right"
  println("The ultimate answer is " + 42)
}

object Test2{
  def name: String = "probably the best object ever "
}

Test2.name


object Test3 {
    def hello ( name : String): String = "Hello "  +  name
}
Test3.hello ("ADK")


object Test4 {
  val name = "Noel "
  def hello(other: String ):String =
    name + "says hi to " + other

}
Test4.hello("Dave")


object Test7 {
  val simpleField = {

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




object Oswal {

  val colour = "red "
  val food = " curry"
}

object Handerson {
   val colour = " blanc"
   val food =  " fufu"
}

object Quentin{
  val colour = "jaune"
  val food = "poisson"

}
Handerson.food


def square (in:Double ): Double =  in * in

assert (square  (in =2.0) ==4.0 )
 def entreeSortie(mot : String) : String  = mot.length
assert (entreeSortie ( mot = "lool") == 3)

"Bonjour Halima".length


(1 : 2: 3)