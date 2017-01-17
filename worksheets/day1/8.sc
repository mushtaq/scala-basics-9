

val xs = List(1, 2, 3, 4)
xs.reduceLeft(_ + _)
xs.foldLeft(0)(_ + _)

List.empty[Int].foldLeft(0)(_ + _)
//List.empty[Int].reduceLeft(_ + _)

xs.reduceLeft((acc, elm) => if(acc < elm) acc else elm)
//List.empty[Int].reduceLeft((acc, elm) => if(acc < elm) acc else elm)

List.empty[Int].min

def map[In, Out](xs: List[In])(f: In => Out): List[Out] = {
  xs.foldLeft(List.empty[Out]) { (acc, elm) =>
    f(elm) :: acc
  }.reverse
}

map(List(1, 2, 3, 4))(_ + 10)


def reverse[T](xs: List[T]): List[T] = {
  xs.foldLeft(List.empty[T])((acc, elm) => elm :: acc)
}

reverse(List(1, 2, 3, 4))

