
import data.Data.books

books.foreach(println)

books.map(book => book.basePrice)
books.map(_.basePrice)
books map (book => book.basePrice)

books.groupBy(_.author).foreach(println)

books
  .groupBy(_.author)
  .mapValues(_.map(_.basePrice).sum)

books
  .groupBy(book => book.author)
  .mapValues(groupBooks => groupBooks.map(book => book.basePrice).sum)

books.sortBy(-_.basePrice).foreach(println)
books.sortBy(book => (-book.basePrice, book.title)).foreach(println)



