
import data.Data.books

val t = books.partition(_.basePrice > 100)

t._1
t._2

books.take(2)
books.drop(2)
books.splitAt(2)

books.takeWhile(_.author == "odersky")
books.dropWhile(_.author == "odersky")
books.span(_.author == "odersky")
