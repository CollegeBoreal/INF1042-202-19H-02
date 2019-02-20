package example


import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "Bonjour" should "Bonjour" in {
    Hello.greeting shouldEqual "bonjour"
  }
}