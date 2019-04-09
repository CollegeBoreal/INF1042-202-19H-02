class Person {
  val firstName = "Romeo"
  val lastName = "Mian"
  def name = firstName  +" " + lastName
}
object alien {
  def greet(p: Person) : String =
  "Greetings" + p.firstName + " " + p.lastName
}


val br = new Person

val br2 = new Person


alien.greet(br)

alien.greet(br2)

class Person_(first: String, last: String) {
  val firstName = first
  val lastName = last

  def name: String = firstName + " " + lastName
}

  val dk = new Person_("Romeo", "Mian")

  dk.firstName
  dk.name

  new Person_("Abbas","Sadissou").name


