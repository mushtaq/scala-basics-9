

def length[T](xs: List[T]): Int = xs match {
  case Nil      => 0
  case ::(h, t) => 1 + length(t)
}

length(List(1, 2, 3, 4))


def length2[T](xs: List[T]): Int = xs match {
  case Nil    => 0
  case h :: t => 1 + length2(t)
}

def map3[A, B](xs: List[A], f: A => B): List[B] = xs match {
  case Nil          => Nil
  case head :: tail => f(head) :: map3(tail, f)
}
