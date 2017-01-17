val xs = List(1, 2, 3, 4)

def m(ps: Int*): Seq[Int] = ps

m(1, 2, 3, 4)
m(xs: _*)


val record: (Int, String, Double) = (1, "asdasd", 100.67)

record._1
record._2
record._3

import data.Data.books

val pairs: Seq[(String, Double)] = books.map(book => (book.title, book.basePrice))

pairs.foreach(println)

pairs.toMap

Map("a" -> 1, "b" -> 2)
Map.apply("a" -> 1, "b" -> 2)
Map apply ("a" -> 1, "b" -> 2)
Map(("a", 1), ("b", 2))

List(1, 2, 3, 4)
List.apply(1, 2, 3, 4)
Set(1, 2, 2, 3, 4, 4)


"a" -> 1
"a".->(1)
"a" -> 1

