class Person {
  val firstName = "Golden"
  val lastName = "Zod"
  def name = firstName + " " + lastName
}

object alien {
  def greet (p: Person) : String =
    "Greeting" + p.firstName + " " + p.lastName
}

val br = new Person
val br2 = new Person

alien.greet(br)
alien.greet(br2)

// constructeur
class Person_(first: String, last: String) {
val firstName = first
val lastName = last
def name: String = firstName + " " + lastName
}

val dk = new Person_("David", "Kaymbe")

dk.firstName
dk.name

new Person_("Abbas", "Sadissou").name
//Exercice 3.1.6.1 page 64-65
//cats, Again
class Cat(val colour: String, val food: String)

val oswald = new Cat (colour = "Black", food = "Milk")

oswald.food
