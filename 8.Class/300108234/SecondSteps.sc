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

