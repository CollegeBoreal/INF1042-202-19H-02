class Person {
  val firstName = "David"
  val lastName = "Kayembe"
  def name: String = firstName + " " + lastName
}

object alien {
  def greet (p: Person) : String =
    "Greetings, " + p.firstName + " " + p.lastName
}

val br = new Person

val br2 = new Person


alien.greet(br)

alien.greet(br2)

// Constructor
class Person_(first: String, last: String) {
  val firstName = first
  val lastName = last
  def name : String = firstName + " " + lastName
}

val dk = new Person_("David", "Kayembe")


dk.firstName
dk.name