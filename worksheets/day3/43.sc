
class Meter(private val value: Double) {
  def +(other: Meter) = new Meter(value + other.value)
}

object Meter {
  def apply(string: String) = new Meter(string.toDouble)
}

val meter = new Meter(100)
val meter2 = Meter("100")

