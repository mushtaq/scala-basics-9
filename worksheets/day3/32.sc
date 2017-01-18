
val pf1: PartialFunction[Int, Int] = {
  case x if x != 0 => 10/x
}

val pf2: PartialFunction[Int, Int] = {
  case x if x == 0 => 0
}


val pf = pf1.orElse(pf2)


