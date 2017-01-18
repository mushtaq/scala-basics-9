
val `my name is mushtaque` = 10

`my name is mushtaque` + 100

"""
  |asa |sd
  |asdasd
  |asdasd
""".stripMargin


val Parser = """(\d+)-(\d+)-(\d+)""".r

val Parser(day, month, year) = "23-04-1997"


def m(string: String) = string match {
  case Parser(day, month, year) => (day, month, year)
  case _ => "error"
}

m("23-04-1997")
