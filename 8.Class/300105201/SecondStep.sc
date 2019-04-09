class Person {
  val firstName = "Jacques"
  val lastName = "Fabrice"
  def name :String = firstName + " " + lastName
}

object alien{
  def greet(p: Person): String =
    "Greetings " + p.firstName + " " + p.lastName

}

val jd = new Person
val jd2 = new Person

alien.greet(jd)

alien.greet(jd2)

//Constructor
class Person_(first: String, last: String){
  val firstName = first
  val lastName = last
  def name : String = firstName + " " + lastName
}

val dk = new Person_("Jacques", "Olson")

df.firstName
df.name

new Person_("Jacques", "Fabrice").name

class Cat(val colour: String, val food: String)
val Oswald = new Cat(colour = "Black", food = "Milk")
val Henderson = new Cat(colour = "Ginger", food = "Chips")
val Quentin = new Cat(colour = "Tabby and white",food = "Curry")