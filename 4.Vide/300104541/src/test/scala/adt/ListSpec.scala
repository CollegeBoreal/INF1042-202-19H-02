package adt

import org.scalatest.{FlatSpec,   Matchers}


class ListSpec extends FlatSpec with Matchers {

  "la liste" should "afficher coucou" in {
    List.coucou shouldEqual "coucou"
  }

}
