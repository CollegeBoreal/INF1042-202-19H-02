object FirstSteps {
  println("Welcome to the Scala worksheet")

  1 + 1

  if (20 > 10) "left" else "right"
}

object Test7 {
  val simpleField = {
    println("Evaluating simplefield")
    42
  }
  def noParameterMethod = {
    println("Evaluating noParameterMethod")
    42
  }
}

Test7

Test7.simpleField

Test7.simpleField

Test7.noParameterMethod

Test7.noParameterMethod

object Oswald {
  val colour = "Black"
  val food = "Milk"
}

Oswald.colour

def square(in: Double): Double = in * in

assert(square(2.0) == 4.0)

def entreeSortie(mot: String) = mot.length

assert(entreeSortie("LOL") == 3)

"Bonjour Halima".length

{ 1; 2; 3}