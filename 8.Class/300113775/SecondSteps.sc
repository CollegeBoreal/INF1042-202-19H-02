class Person {
  val firstName = "Widby"
  val lastName = "welsh"
  def name :String = firstName +""+ lastName
}

object alien {
  def greet (p: Person) :String =
    "Greetings " + p.firstName + " "+p.lastName
}
val br = new Person

val br2 = new Person

alien.greet(br)
alien.greet(br2)

// Construtor
class Person_( first: String, last: String){
  val firstName = first
  val lastName= last
  def name : String =firstName + " " + lastName
}

val dk = new Person_("Widby", "Armand")
dk.firstName
dk.name

new Person_("Whtiby", "Harmand").name

class Cat(val colour: String, val food: String)
val Oswald = new Cat(colour = "Black", food = "Milk")
val Henderson = new Cat(colour = "Ginger", food = "Chips")
val Quentin = new Cat(colour = "Tabby and white",food = "Curry")