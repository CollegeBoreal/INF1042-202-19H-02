package adt

sealed trait List [+A]
case object Nil extends List[Nothing]
case class Cons[+A] (head: A, tail: List[A]) extends List[A]

object list {
  val coucou = "coucou"

  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons (x,xs) => x + sum(xs)

  def product(ds: List[Double]): Double = ds match {
    case Nil => 1.0
    case Cons(0., _) => 0.0
    case Cons(x,xs) => x * product(xs)
  }
  def findFirst(ss: Array[String], key: String) : Int = {
    def loop(n: Int): Int = {
      if 9n >= ss.length) -1
      else if (ss(n) == key) n
      else loop(n + 1)
    }
    look(0)
  }
  }

  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))


}
