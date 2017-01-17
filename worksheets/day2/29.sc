
object Email {
  def unapply(s: String): Option[(String, String)] = s.split("@") match {
    case Array(user, domain) => Some((user, domain))
    case _                   => None
  }
}

def m(string: String) = string match {
  case Email(user, domain) => s"hello $user from $domain"
  case _                   => "error"
}

m("mushtaq@thoughtworks.com")
m("mushtaq@thoughtworks.com@asdasd")
m("mushtaq")

val Email("mushtaq", domain) = "mushtaq@thoughtworks.com"
