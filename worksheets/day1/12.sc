
val map = Map(1 -> "a", 2 -> "b", 3 -> "c")

val list = List(1, 2, 3)

val set = Set(1, 3)


list.map(map)
list.map(x => map(x))

list.filter(set)
