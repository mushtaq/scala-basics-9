
object A {

  sealed trait Customer
  case object Regular extends Customer
  case object Rewards extends Customer

  sealed trait Day
  case object Weekday extends Day
  case object Weekend extends Day

  val t = (Regular, Weekday)

  t._2
  t._1

  case class Category(customer: Customer, day: Day)

  val category = Category(Regular, Weekday)

  category.day
  category.customer



}