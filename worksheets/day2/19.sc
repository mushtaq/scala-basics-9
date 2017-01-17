
case class Person(name: String, age: Int) {

}


val p = new Person("ashok", 35)
val p2 = new Person("ashok", 35)

p.hashCode()
p2.hashCode()

p == p2

p.name
p.age

p.copy()
p.copy(age = 100)
p.copy(name = "abc")

