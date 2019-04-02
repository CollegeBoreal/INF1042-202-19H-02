
class Person {

  val firstName = "amir"
  val lastName = "aek"

  def name = firstName + " " + lastName
}

object  alien {
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
  def name : String = firstName + lastName
}
 val dk = new Person_("Dvid", " Kayemb")
 dk.firstName
dk.name


class CAT_(blanc: String, curry: String) {
  val couleur = "blanc"
  val food = "curry"
}
object Oswald {

}

object Henderson {

}
object Quetin {

}

