class Person {
  val firstName = "Prof"
  val lastName = "Info"
  def name = firstName + " " + lastName
}

object alien {
  def greet(p: Person) =
    "Greetings " + p.firstName + " " + p.lastName
}

val br = new Person
val br2 = new Person

alien.greet(br)
alien.greet(br2)

// Constructor
class Person_(first: String, last: String) {
  val firstName = first
  val lastName = last
  def name = firstName + " " + lastName
}

val dk = new Person_("David", "Kayembe")

dk.firstName
dk.name

new Person_("Abbas","Sadissou").name


// Exercice 3.1.6.1 page 64-65
// Cats, Again

