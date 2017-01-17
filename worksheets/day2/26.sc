
def isEmpty[T](option: Option[T]) = option match {
  case Some(x) => false
  case None => true
}

isEmpty(None)
isEmpty(Some(90))


def add(option1: Option[Int], option2: Option[Int]): Option[Int] = {

  (option1, option2) match {
    case (Some(aaaa), Some(aaa)) => Some(aaaa + aaa)
    case (None, _) => option2
    case (_, None) => option1
  }

}