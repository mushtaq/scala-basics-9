val flag = true

trait Base
class D1 extends Base
class D2 extends Base

def x = if(flag) new D1 else new D2
def x2 = if(flag) new D1 else "abc"
def x3 = if(flag) new D1 else 10
def x4 = if(flag) () else 10.0
def x5 = if(flag) 10 //else ()
def x6 = if(flag) "aasd"//else ()

def x7 = if(flag) "aasd" else null
def x9 = if(flag) new D1 else null
def x10 = if(flag) 10 else null
def x11 = if(flag) "asdasdelse" else throw new RuntimeException
def x12 = if(flag) 10 else throw new RuntimeException

def ex = throw new RuntimeException

null