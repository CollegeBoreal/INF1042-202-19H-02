class Person {

  val firstName = "Cheikh"
  val lastName = "Thiam"

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

class person_(first: String, last:String){
 val firstName = first
  val lastName = last
  def name : String = firstName + " " + lastName
}
val dk = new  person_("David","Kayembe")
dk.firstName
dk.name
// exce 3.1.6,1 page64 65
//cats Again

class Cat (val colour: String, food: String)
val Oswald = new Cat (colour = "black", food =" Milk")

class Person--(val firstName: String, val lastName: String) {
  def name = firstName + " " + lastName

  val golden = new Person--("zod", "Golden")

  class Adder(amount: Int) {
    def apply(in: Int): Int = in + amount
  }

    val ajout = new Adder (amount = 3)


