class Person {
  val firstName = "Halima"
  val lastName = "Fadde"
  def name = firstName + " " + lastName
}

object alien {
  def greet(p: Person) =
    "Greetings, " + p.firstName + " " + p.lastName
}
val hf = new Person
val hf2 = new Person

alien.greet(hf)

alien.greet(hf2)

class Person_(first: String, last: String) {
  val firstName = first
  val lastName = last
  def name = firstName + " " + lastName
}

val bz = new Person_("X","Y")

bz.firstName
bz.name


class Cat(val colour: String, val food: String)
val oswald = new Cat("Black", "Milk")
val henderson = new Cat("Ginger", "Chips")
val quentin = new Cat("Tabby and white", "Curry")
