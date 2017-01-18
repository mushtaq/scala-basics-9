
val xs = List(2, 3, 1, 6)

xs.sorted

xs.max

import data.Book
import data.Data.books
import play.api.libs.json.Json

books.head

val json = Json.toJson(books.head)

json.as[Book]
