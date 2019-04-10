case class Person(firstName: String = "X", lastName: String = "Y") {
  def name = firstName + " " + lastName
}

Person
val a = Person()
a
a.firstName

val b = Person(firstName="Z",lastName ="W")
b

//egalité

Person("X", "Y") == Person("X", "Y")
Person("X", "Y") equals Person("X", "Y")


b.copy()
b.copy(firstName = "z")



case object Citizen {
  def firstName = "muha"
  def lastName = "med"
  def name = firstName + " " + lastName
}

//citizen.toString

case class Personne(prenom: String, nom: String)

object Etudiants {
  def trouve(personne: Personne): String = {
    personne match {
      case Personne("Cheikh", "Thiam") => "100%"
      case Personne("Abbas", "Sadissou") => "100%"
      case Personne("Ginette", _) => "500%"
      case Personne(prenom, nom) => s"Salut, $nom"
    }
  }
}

val abbas = Personne(nom = "Sadissou", prenom = "Abbas")

Etudiants.trouve(abbas)

Etudiants.trouve(abbas.copy(prenom = "Ginette"))

Etudiants.trouve(Personne("Abdelkader","ADK"))
