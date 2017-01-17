package data

import play.api.libs.json._

object JsDemo {
  def transform(jsValue: JsValue): JsValue = jsValue match {
    case JsNumber(value)                            => JsNumber(value * value)
    case JsArray(values)                            => JsArray(values.map(transform))
    case JsString(value) if value.startsWith("urn") => JsString("hello " + value.stripPrefix("urn:"))
    case JsObject(values)                           => JsObject(
      values.map {
        case t@("m" | "n", v) => t
        case (k, v)           => k -> transform(v)
      }
    )
    case x                                          => x
  }

}
