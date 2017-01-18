package sort

trait Ord[T] {
  def lt(a: T, b: T): Boolean
}

object Ord {
  implicit val intOrd: Ord[Int] = (a, b) => a < b

  implicit val strOrd: Ord[String] = (a, b) => a < b

  implicit def optOrd[T](implicit ord: Ord[T]): Ord[Option[T]] = (a, b) => (a, b) match {
    case (Some(x), Some(y)) => ord.lt(x, y)
    case (None, _)          => true
    case (_, None)          => false
  }

  implicit def tupleOrd[T1, T2](implicit ord1: Ord[T1], ord2: Ord[T2]): Ord[(T1, T2)] = (a: (T1, T2), b: (T1, T2)) => {
    if (ord1.lt(a._1, b._1)) true
    else if (ord1.lt(b._1, a._1)) false
    else ord2.lt(a._2, b._2)
  }

}
