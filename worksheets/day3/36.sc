
(1, "a")

Tuple2(1, "a")

case class Meter(value: Double) extends Double {
  def +(other: Meter) = Meter(value + other.value, "asdsa")
}

Meter(100) + Meter(300)

