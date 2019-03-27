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