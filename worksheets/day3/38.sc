import scala.util.control.NonFatal

try 1/0 catch {
  case ex: ArithmeticException => 100
  case ex: RuntimeException =>
  case NonFatal(ex) => ex.printStackTrace()
}