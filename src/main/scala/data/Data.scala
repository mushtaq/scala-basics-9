package data

import play.api.libs.json.{Json, OFormat}
import sort.Ord


case class Address(street: String, pin: Int)

object Address {
  
}

case class Person(name: String, address: Address)

object Person {
  
}

case class Book(
  author: String,
  title: String,
  basePrice: Double,
  isImported: Boolean
  )

object Book {
  implicit val bookOrd: Ord[Book] = (a, b) => a.basePrice < b.basePrice
  implicit val format: OFormat[Book] = Json.format
}

object Data {

  val books = List(
    Book("odersky", "scala prog", 100, false),
    Book("odersky", "apple", 100, false),
    Book("odersky", "complexity", 400, false),
    Book("misky", "ocaml prog", 1000, true),
    Book("misky", "sml", 88, false),
    Book("hickey", "clojure prog", 500, true)
  )

  val people = List(
    Person("mushtaq", Address("baner", 123)),
    Person("ajit", Address("pashan", 100))
  )
}
