
val xs = List(1, 2, 3)

val ys = List("a", "b")


xs.map(x => println(x))

var state = 0

xs.foreach { x =>
  state = state + x
  println(x)
}

state

for {
  x <- xs
  if x == 1
  t = x + 10
  y <- ys
  if y == "b"
} {
  println(x, y)
}
