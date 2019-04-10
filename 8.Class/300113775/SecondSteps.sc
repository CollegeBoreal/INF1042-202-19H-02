class Person {
  val firstName = "Widby"
  val lastName = "welsh"
  def name :String = firstName +""+ lastName
}

object alien {
  def greet (p: Person) :String =
    "Greetings " + p.firstName + " "+p.lastName
}
val br = new Person

val br2 = new Person

alien.greet(br)
alien.greet(br2)

// Construtor
class Person_( first: String, last: String){
  val firstName = first
  val lastName= last
  def name : String =firstName + " " + lastName
}

val dk = new Person_("Widby", "Armand")
dk.firstName
dk.name

new Person_("Whtiby", "Harmand").name




class Cat(val colour: String, val food: String)
val Oswald = new Cat(colour = "Black", food = "Milk")
val Henderson = new Cat(colour = "Ginger", food = "Chips")
val Quentin = new Cat(colour = "Tabby and white",food = "Curry")

Oswald.colour
Oswald.food

class Person__(val firstName: String, val lastName: String){
  def name = firstName + " " + lastName
}

val lufi = new Person__("WHITBY", "HARMAND")

lufi.name

//ou on peut ecrire

new Person__("WHITBY ", "HARMAND").name

class Person___(val firstName: String = "Prenom", val lastName: String = "Nom"){
  def name = firstName + " " + lastName
}

//keyword parameter
new Person___(lastName = "Etienne", firstName = "Kitovah").name

//Default Parameter, si vous ne mettez rien ca prend le parametre par defaut
new Person___().name

def badness = throw new Exception("Error")

def otherbadness = null

val bar1 = if(true) 123 else badness

val bar = if(false) "it worked" else otherbadness

class Adder(amount: Int) {
  def apply(in: Int) = in + amount
}

val ajout = new Adder(amount = 3)
val ajout2 = new Adder(amount = 3)
val a2 = ajout2.apply(3)
// pas besoin de rappeler avec apply
val a3 = ajout2(4)

class Timestamp(val seconds: Long)

// Companion object

object Timestamp {
  def apply(hours: Int, minutes: Int, seconds: Int): Timestamp =
    new Timestamp(hours*60*60 + minutes*60 + seconds)
}

val t = Timestamp(1,1,1)
t.seconds

//ou

val t1 = Timestamp.apply(1,1,2)
t1.seconds