import scala.collection.mutable

val b = mutable.Buffer.empty[Int]

b += 10

val xs = List(1, 2, 3, 4)

xs.map(x => x * x)

xs.map { x =>
  x * x
}

xs.map { x: Int =>
  x * x
}

val square: Int => Int = { x =>
  x * x
}

def square2(x: Int): Int = x * x

xs.map(square)
xs.map(square2)
