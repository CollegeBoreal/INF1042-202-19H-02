class Person {
  val firstName = "abbas"
  val lastName = "sadissou"
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
