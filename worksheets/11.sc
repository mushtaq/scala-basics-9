object A extends (Int => Int){
  def apply(x: Int) = x
}

A(100)
A.apply(100)
A: Int => Int

val xs = List("10", "20", "30")

xs(1)
xs.apply(1)
xs apply 1

xs: List[String]
xs: Int => String

val ys = Set(1, 2, 3, 3)

ys(20)
ys(2)

ys: Set[Int]
ys: Int => Boolean

val zs = Map(1 -> "a", 2 -> "b", 3 -> "c")

zs: Map[Int, String]

zs(1)
zs: Int => String

//xs(100)
zs(100)