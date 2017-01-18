import play.api.libs.functional.Functor

List(10).map(_ + 100)
List.empty[Int].map(_ + 100)


Option(10).map(_ + 100)
Option.empty[Int].map(_ + 100)

Functor

List(10).flatMap(x => List(9).map(y => x + y))

Option(10).flatMap(x => Option(9).map(y => x + y))


