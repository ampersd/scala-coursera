package demo

import org.scalatest.FunSuite
/**
  * Created by Anton on 11/8/2015.
  */
class HelloTest extends FunSuite {
  test("sayHello method works correctly") {
    val hello = new Hello
    assert(hello.sayHello("Scala") == "Hello, Scala")
  }
}
