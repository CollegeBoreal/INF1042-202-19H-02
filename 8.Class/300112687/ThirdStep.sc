case class Person(firstName: String = "Didier"
                  , lastName: String = "Digma") {
  def name = firstName + " " + lastName
}

Person

val d = Person()

d

d.firstName

val a = Person(lastName = "Sadissou", firstName = "Abbas")

a

// egalite

Person("Widby", "Armand") == Person("Widby","Armand")

Person("Widby", "Armand") equals Person("Widby","Armand")

a.copy()

a.copy(firstName = "Alade")

case object Citizen {
  def firstName = "Zod"
  def lastName = "Golden"
  def name = firstName + "" + lastName
}

Citizen.toString

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

