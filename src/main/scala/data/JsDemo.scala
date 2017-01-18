package data

import play.api.libs.json._

object JsDemo {
  def transform(jsValue: JsValue): JsValue = jsValue match {
    case JsNumber(value)           => JsNumber(value * value)
    case JsArray(values)           => JsArray(values.map(transform))
    case JsString("urn" :: suffix) => JsString(s"hello $suffix")
    case JsObject(values)          => JsObject(
      values.map {
        case t@("m" | "n", v) => t
        case (k, v)           => k -> transform(v)
      }
    )
    case x                         => x
  }

  object :: {
    def unapply(s: String): Option[(String, String)] = s.split(":") match {
      case Array(prefix, suffix) => Some((prefix, suffix))
      case _                     => None
    }
  }

}
