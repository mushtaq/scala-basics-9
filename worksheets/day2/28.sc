

class Person(val name: String, val age: Int)

object Person2 {
  def apply(name: String, age: Int): Person = new Person(name, age)
  def unapply(p: Person): Option[(String, Int)] = Some((p.name, p.age))
}

val p = Person2("abc", 35)

val Person2(name1, age1) = p

name1

age1




