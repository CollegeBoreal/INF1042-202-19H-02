case class Person(FirstName: String = "Toch", LastName: String = "Etienne") {
  def name = FirstName + " " + LastName
}

Person

val d = Person()

d

d.FirstName

val a = Person(LastName = "Joseph", FirstName = "Ricca")

a

//Egalite

Person("Widby", "Armand") == Person("Widby", "Armand")

Person("Widby", "Armand") equals Person("Widby", "Armand")

a.copy()

a.copy(FirstName = "Kito")

case object Citizen{
  def FirstName = "Zod"
  def LastName = "Golden"
  def name = FirstName + " " + LastName
}

Citizen.toString

case class Personne(prenom: String, nom: String)

object Etudiants{
  def trouve(personne: Personne): String = {
    personne match{
      case Personne("Cheikh", "Thiam") => "100%"
      case Personne("Abbas", "Sadissou") => "100%"
      case Personne("Halima", _) => "500%"
      case Personne(prenom, nom) => s"salut, $nom"
    }
  }
}

val abbas = Personne(nom = "Sadissou", prenom = "Abbas")

Etudiants.trouve(abbas)

Etudiants.trouve(abbas.copy(prenom = "Ginette"))

Etudiants.trouve(Personne("Abdelkader", "ADK"))