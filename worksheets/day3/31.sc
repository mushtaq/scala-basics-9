
import data.Book
import data.Data.books

books.filter(_.author == "odersky").map(_.basePrice)

val pf: PartialFunction[Book, Double] = {
  case Book("odersky", _, price, _) => price
}

books.filter(pf.isDefinedAt).map(pf)

books.collect {
  case Book("odersky", _, price, _) => price
  case book if book.author == "odersky" => book.basePrice
}
