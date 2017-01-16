val xs = List(1, 2, 3, 4)

def foldLeft[Result](xs: List[Int], seed: Result)(f: (Result, Int) => Result): Result = {
  val it = xs.iterator
  var result = seed

  while (it.hasNext) {
    println(s"current value is: $result")
    result = f(result, it.next())
  }

  result
}

def sum(xs: List[Int]): Int = {
  foldLeft(xs, 0)((acc, elm) => acc + elm)
}

def multiply(xs: List[Int]): Int = {
  foldLeft(xs, 1)((acc, elm) => acc * elm)
}

def stringify(xs: List[Int]): String = {
  foldLeft(xs, "")((acc, elm) => acc + elm)
}

//sum(xs)
//multiply(xs)
stringify(xs)
