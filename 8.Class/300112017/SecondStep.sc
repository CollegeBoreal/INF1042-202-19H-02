class Person {
  val firstName = "Olaitan"
  val lastName = "Ador"
  def name = firstName + " " + lastName
}

object alien {
  def greet(p: Person) : String =
    "Greeting" + p.firstName + " " + p.lastName
}
val br = new Person

val br2 = new Person

alien.greet(br2)

// Constructor
class Person_(first: String, last: String) {
  val firstName = first
  val lastName = last
  def name: String = firstName + " " + lastName
}
val dk = new Person_("David", "Kaymbe")
dk.firstName
dk.name