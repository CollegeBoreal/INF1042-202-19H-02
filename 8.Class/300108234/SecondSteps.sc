class Person {
  val firstName = "Halima"
  val lastName = "Fadde"
  def name = firstName + " " + lastName
}

object alien {
  def greet(p: Person) =
    "Greetings, " + p.firstName + " " + p.lastName
}
val hf = new Person
val hf2 = new Person

alien.greet(hf)

alien.greet(hf2)

class Person_(first: String, last: String) {
  val firstName = first
  val lastName = last
  def name = firstName + " " + lastName
}

val bz = new Person_("X","Y")

bz.firstName
bz.name


class Cat(val colour: String, val food: String)
val oswald = new Cat("Black", "Milk")
val henderson = new Cat("Ginger", "Chips")
val quentin = new Cat("Tabby and white", "Curry")


class Person__(val firstName: String, val lastName: String) {
  def name = firstName + " " + lastName
}

val lima = new Person__("ha", "lima")
lima.name


new Person__("kha", "dija").name

class Person___(val firstName: String = "Prenom", val lastName: String = "Nom") {
  def name = firstName + " " + lastName
}


new Person___(lastName = "jk", firstName = "muha").name

new Person___().name



def badness = throw new Exception("serviette")
def otherbadness = null
val bar = if(true) 123 else badness
val baz = if(false) "on the way" else otherbadness


class Adder(amount: Int) {
  def add(in: Int) = in + amount
  def apply(in: Int) = in + amount
}

val ajout = new Adder(amount = 3)
val ajout2 = new Adder(amount = 3)
val a2 = ajout2.apply(3)
val a3 = ajout2(4)


class Timestamp(val seconds: Long)

object Timestamp {
  def apply(hours: Int, minutes: Int, seconds: Int): Timestamp =
    new Timestamp(hours*60*60 + minutes*60 + seconds)
}
Timestamp(1, 1, 1).seconds

