
val indianPersonCanDrink: (Int) => Boolean = new (Int => Boolean) {
  override def apply(age: Int): Boolean = age > 30
}

val canDrink: Int => Boolean = { age =>
  age > 30
}

val canDrink5 = { age: Int =>
  age > 30
}

val canDrink3: Int => Boolean = age => age > 30
val canDrink4: Int => Boolean = (age => age > 30)

def canDrink2(age: Int): Boolean = age > 30

val a0 = canDrink
val a: Int => Boolean = canDrink
val a2: Int => Boolean = canDrink2
val a3 = canDrink2 _

canDrink(40)
canDrink2(40)

class Person(age: Int, isFemale: Boolean) {

  def isWise: Boolean =
    if(isFemale) age > 18 else age > 21

  def canMarry(canDrink: Int => Boolean): Boolean = {
    isWise && canDrink(age)
  }
}

val p = new Person(27, true)

p.isWise
p.canMarry(canDrink)
p.canMarry(canDrink2)
