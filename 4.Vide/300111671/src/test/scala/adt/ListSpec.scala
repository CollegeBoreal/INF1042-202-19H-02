package adt

import org.scalatest._

class listSpec extends FlatSpec with Matchers {
 " The listSpec object " should  "affiche coucou" in {
    List.coucou shouldEqual "coucou"
 }
}
