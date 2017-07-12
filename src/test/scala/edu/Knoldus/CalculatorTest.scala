package edu.Knoldus

import org.scalatest.FunSuite

/**
  * Created by knoldus on 12/7/17.
  */
class CalculatorTest extends FunSuite {

  val cal = new Calculator

  test("adding two numbers") {
    assert(cal.add(2, 3) == 5)
  }

  test("subtracting two numbers") {
    assert(cal.subtract(2, 3) == (-1))
  }

  test("multiplying two numbers") {
    assert(cal.multiply(2, 3) == 6)
  }

  test("dividing two numbers") {
    assert(cal.divide(4, 2) == 2.0)
  }

  test("dividing by zero") {
    intercept[java.lang.IllegalArgumentException] {
      cal.divide(4,0)
    }
  }

  test("finding modulus"){
    assert(cal.modulus(4, 2) == 0)
  }

  test("modulus when dividing by zero"){
    intercept[java.lang.IllegalArgumentException] {
      cal.modulus(4,0)
    }
  }

  test("finding absolute"){
    assert(cal.absolute(4) == 4)
    assert(cal.absolute(-4) == 4)
  }

  test("finding power"){
    assert(cal.power(4, 2) == 16.0)

  }

  test("finding power with negative power"){
    assert(cal.power(2, -3) == 0.125)
  }

  test("finding minimum"){
    assert(cal.min(4, 2) == 2)
    assert(cal.min(2,4) == 2)
  }

  test("finding maximum"){
    assert(cal.max(4, 2) == 4)
    assert(cal.max(2,4) == 4)
  }





}
