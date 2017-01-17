
object A {
  def m = 10
  val x = "asdasd"
  var y: String = null
}


A.m
A.y = "asdasd"
A.x

A: AnyRef
A: A.type

object A2 extends AnyRef

val x = "abc"
val y = "abc"
val z = y

x: AnyRef
x: String
x: x.type

y: AnyRef
y: String
y: y.type



