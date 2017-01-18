
val divide10: Int => Int = { x =>
  10/x
}

val divide10a: Function1[Int, Int] = {
  case x if x !=0 => 10/x
  case x => 0
}

divide10a(1)
divide10a(2)
divide10a(0)

val divide10b: Function1[Int, Int] = {
  case x if x !=0 => 10/x
}

divide10b(1)
//divide10b(0)

val divide10c: PartialFunction[Int, Int] = {
  case x if x !=0 => 10/x
}

divide10c(1)

divide10c.isDefinedAt(0)
divide10c.isDefinedAt(10)

//divide10c(0)





