
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


// Exerc
// cat


class Cat(val colour: String, val food: String)

val oswald = new Cat("Black", "Milk")
val henderson = new Cat("Ginger", "Chips")
val quentin = new Cat("Tabby and white", "Curry")

class  Person__(val firstName: String, val lastName: String) {
  def name: String = firstName + " " + lastName
}
val  golden = new Person__("Zod", "golden")
new Person__("Abbas", "sadissou").name
val halima = new Person__("halima", "feddad")


class  Person__(val firstName: String, val lastName: String) {
  def name: String = firstName + " " + lastName
}

// nnnn
def badness = throw new Exception("Serviette")
def otherbadness : Null = null

val bar = if(false) 123 else badness

val bar = if (false) "sakamache" else  otherbadness


class Adder(amount: Int) {
  def apply(in: Int): Int= in + amount
}
  
  val ajout = new Adder(amount = 3 )
  val ajout2 = new Adder(amount = 3 )
ajout2.apply()


 // cc
 class Timestamp(val seconds: Long)
object Timestamp {
  def apply(hours: Int, minutes: Int, seconds: Int): Timestamp =
    new Timestamp(hours*60*60 + minutes*60 + seconds)
}
Timestamp(1, 1, 1).seconds
