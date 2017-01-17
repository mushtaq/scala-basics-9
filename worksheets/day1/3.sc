import scala.annotation.tailrec
import scala.collection.mutable

def map(xs: List[Int], f: Int => Int): List[Int] = {
  val it = xs.iterator
  val b = mutable.Buffer.empty[Int]

  while (it.hasNext) {
    b += f(it.next())
  }

  b.toList
}

def map2(xs: List[Int], f: Int => Int): List[Int] = {

  val it = xs.iterator
  var b = List.empty[Int]

  while (it.hasNext) {
    b = f(it.next()) :: b
  }

  b
}

def map3(xs: List[Int], f: Int => Int): List[Int] = {
  if(xs.isEmpty) Nil else f(xs.head) :: map3(xs.tail, f)
}

def map5(xs: List[Int], f: Int => Int): List[Int] = {

  @tailrec
  def map4(xs: List[Int], acc: List[Int]): List[Int] = {
    if(xs.isEmpty) acc
    else map4(xs.tail, f(xs.head) :: acc)
  }

  map4(xs, List.empty).reverse
}

map5((1 to 100000).toList, x => x * x)
map5(List(1, 2, 3, 4), x => x + 10)
