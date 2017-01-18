import data.Data.books
import sort.{Ord, Sorter}

implicit val intOrd: Ord[Int] = (a, b) => a > b

Sorter.sort(List(2, 5, 1, 10, 6))
Sorter.sort(List("d", "x", "a"))

Sorter.sort(
  List(Option(10), None, Option(3))
)

Sorter.sort(
  List(Option("z"), None, Option("f"))
)

Sorter.sort(
  books.map(Option.apply)
)

Sorter.sort(
  List(("s", 10), ("s", 7), ("a", 100))
)

Sorter.sort(
  List((Option("s"), Option(10)), (Option("s"), None), (Option("a"), Option(100)))
)