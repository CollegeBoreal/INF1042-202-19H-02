package adt

import org.scalatest.{FlatSpec, Matchers}

class ListSpec extends FlatSpec with Matchers {

  "la liste" should "afficher coucou" in {
    List.coucou shouldEqual "coucou"
  }

  "la somme" should "afficher 6" in {
    List.sum(List(1, 2, 3)) shouldEqual 6
  }

  "le produit" should "afficher 0" in {
    List.product(List(1.0, 2.0, 3.0)) shouldEqual 6.0
  }
  "Trouver le premier" should "afficher 3" in {
    List.findFirst(Array("Romeo", "Golden", "David", "Halima"), key = "Halima") shouldEqual 3
  }
  "trouver algebraiquement l'indice" should "afficher 2" in {
    List.findFirst(Array(0, 2, 4, 5), (a: Int) => a == 4) shouldEqual 2
  }
  "trouver l'indice d'un tableau de double" should "afficher 4" in {
    List.findFirst(Array(1.2, 1.3, 1.6, 2.3, 5.7, 7.5), (a: Double) => a == 5.7) shouldEqual 4
  }
  "trouver le charactere" should "afficher 3" in {
    List.findFirst(Array('a', 'c', 'f', 'w'), (a: Char) => a == 'w') shouldEqual 3
  }
}
