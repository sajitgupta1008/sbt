package edu.Knoldus

/**
  * Created by knoldus on 12/7/17.
  */
class Calculator {

  def add(a: Int, b: Int): Int = a + b

  def subtract(a: Int, b: Int): Int = a - b

  def multiply(a: Int, b: Int): Int = a * b

  def divide(a: Int, b: Int): Double = {
    require(b != 0)
    a / b.toDouble
  }


  def power(a: Int, b: Int): Double = {

    def compute(a: Int, b: Int, ans: Int): Int = {
      if (b == 0) ans else compute(a, b - 1, ans * a)
    }

    val aa = compute(a, absolute(b), 1)

    val v = if (b >= 0) aa else 1.0 / aa

    v
  }

  def absolute(a: Int): Int = if (a >= 0) a else -a

  def modulus(a: Int, b: Int): Int = {
    require(b != 0)
    a % b
  }

  def min(a: Int, b: Int): Int = if (a <= b) a else b

  def max(a: Int, b: Int): Int = if (a >= b) a else b


}
