package adt

import org.scalatest._

class ListSpec extends FlatSpec with Matchers{
  "La liste" should "afficher coucou " in {
    List.coucou shouldEqual "coucou"
  }
  }
