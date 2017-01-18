package example

object StringExtensions {
  class RichString(val str: String) extends AnyVal {
    def pluralize: String = s"${str}s"
  }

  implicit def String2RichString(string: String): RichString = new RichString(string)

  implicit def String2Int(string: String): Int = string.length
  implicit def String2Int2(string: String): Int = string.length


}
