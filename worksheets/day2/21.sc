import scala.collection.immutable.Seq
sealed trait Day

object Day {
  val values: Seq[Day] = List(Sunday, Monday)
//  val values2: Seq[Sunday.type] = List(Sunday)
}

case object Sunday extends Day
case object Monday extends Day


Day.values


Sunday
Monday


class A {
  A.x
}

object A {
  private val x = 10
}

A: A.type
