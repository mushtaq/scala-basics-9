
def sum3(a: Int, b: Int, c: Int) = a + b + c
def sum2(b: Int, c: Int) = sum3(10, b, c)
def sum1(c: Int) = sum2(20, c)

sum3(10, _: Int, _: Int)

val sum3F = sum3 _

sum3(1, 2, 3)
sum2(2, 3)
sum1(3)

def sum3C(a: Int)(b: Int)(c: Int) = a + b + c

val sum3CF = sum3C _
val sum2CF = sum3CF(10)
val sum1CF = sum2CF(20)


sum3C(1)(2)(3)
sum3CF(1)(2)(3)
sum2CF(2)(3)
sum1CF(3)

