
val map = Map(1 -> "a", 2 -> "b")

map(1)
map(2)
map.apply(2)

//map(10)

val option: Option[String] = map.get(1)
val option1: Option[String] = map.get(10)

option
