
val xs = List(1, 2, 3)

val ys = List("a", "b")

xs.map(x => ys.map(y => x -> y))

xs.flatMap { x =>
  ys.map { y =>
    x -> y
  }
}

xs
  .filter(_ == 1)
  .flatMap(x => ys.filter(_ == "b").map(y => x -> y))

for {
  x <- xs
  if x == 1
  t = x + 10
  y <- ys
  if y == "b"
} yield t -> y


(xs).flatMap { case x => (ys).map { case y => x -> y }}

