
def add(a: Int, b: Int) = a + b
add _

val xs = List(1, 2, 3, 4)

xs.foldLeft(0)((acc, elm) => add(acc, elm))

xs.sum

xs.foldLeft(0)((acc, elm) => acc + elm)

xs.foldLeft(0)(_ + _)

xs.foldLeft(0)(add)


xs.map(x => x + 1)

xs.map(_ + 1)

def square(x: Int) = x * x

xs.map(square)

xs.map(x => square(x))


