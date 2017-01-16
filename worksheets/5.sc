import scala.collection.mutable

trait SAM {
  def invoke(x: Int): Int
}

val sam = new SAM {
  override def invoke(x: Int) = x * x
}

val sam2: SAM = x => x * x

sam.invoke(100)

sam2.invoke(100)

def map(xs: List[Int], f: SAM): List[Int] = {
  val it = xs.iterator
  val b = mutable.Buffer.empty[Int]

  while (it.hasNext) {
    b += f.invoke(it.next())
  }

  b.toList
}


map(List(1, 2, 3, 4), x => x + 10)
