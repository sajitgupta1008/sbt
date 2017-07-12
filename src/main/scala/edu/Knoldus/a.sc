2^3

def power(a: Int, b: Int): Double = {

  def compute(a: Int, b: Int, ans: Int):Int = {
    if (b == 0)
      ans
    else
      compute(a, b - 1, ans * a)
  }

  val aa = compute(a, Math.abs(b), 1)

  val v = if(b>0) aa else 1.0/aa

  v
}

def modulus(a: Int, b: Int): Int = {
  require(b != 0)
  a % b
}


modulus(-2,3)









Math.pow(2,-3)






