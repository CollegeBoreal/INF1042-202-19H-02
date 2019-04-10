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

class Cat(val colour: String, val food: String)
val oswald = new Cat("Black", "Milk")
val henderson = new Cat("Ginger", "Chips")
val quentin = new Cat("Tabby and white", "Curry")


class Person__(val firstName: String, val lastName: String) {
  def name = firstName + " " + lastName
}

val golden = new Person__("Zod","Golden")

golden.name

new Person__("Abbas","Sadissou").name

val halima = new Person__("Halima","Fadde")

class Person___(val firstName: String = "Prenom"
                , val lastName: String = "Nom") {
  def name = firstName + " " + lastName
}

// Keyword Parameter
new Person___(lastName = "Pasterero",
  firstName = "Aziz").name

// Default Parameter
new Person___().name

def badness = throw new Exception("Serviette")

def otherbadness = null

val bar = if(true) 123 else badness

val baz = if (false) "sakamache" else otherbadness

class Adder(amount: Int) {
  def add(in: Int) = in + amount
  def apply(in: Int) = in - amount
}

val ajout = new Adder(amount = 3)
val ajout2 = new Adder(amount = 3)
val a2 = ajout2.apply(3)
val a3 = ajout2(4)

class Timestamp(val seconds: Long)

// Companion object

object Timestamp {
  def apply(hours: Int, minutes: Int, seconds: Int): Timestamp =
    new Timestamp(hours*60*60 + minutes*60 + seconds)
}

val t = Timestamp(1,1,1)
t.seconds
