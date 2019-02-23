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

  "trouver le premier" should "afficher 3" in {
    List.findFirst(Array("Romeo", "Halima", "David", "Djuma"), "Djuma") shouldEqual 3
  }

  "trouver algebraiquement l indice" should "afficher 2" in {
    List.findFirst(Array(0, 2, 4, 5), (a: Int) => a == 4) shouldEqual 2
  }
}
