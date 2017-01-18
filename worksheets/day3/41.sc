object Pipelining {
  implicit def toPipe[T](x : T) = new {
    def |> [U](f : T => U) = f(x)
  }
}

import Pipelining._

List(5,6,7) |> (_.map(_.toString)) |> println

object A {

  type Squeak = {
    def squeak: String
    def smile: Int
  }

  def sayHello(x: Squeak) = {
    println(s"Hello ${x.squeak}")
  }

  class Duck {
    def squeak: String = "duck"
    def smile = 100
  }

  class Dog {
    def squeak: String = "bow"
    def smile = 100
  }

  class Cat {
    def squeak = 100
  }

}
import A._
sayHello(new Duck)
sayHello(new Dog)
sayHello(new Cat)
