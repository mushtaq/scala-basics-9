
val string2List: String => List[Char] = str => str.toList

val list2Int: List[Char] => Int = list => list.length

val string2Int: (String) => Int = string2List andThen list2Int
val string2Intb: (String) => Int = list2Int compose string2List

(string2List andThen list2Int)("asdasdasd")
string2Int("asdasdasd")
string2Intb("asdasdasd")

