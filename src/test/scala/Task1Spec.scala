import org.specs2.mutable.Specification

class Task1Spec extends Specification {
  sequential
  "addNumbers" should {
    "add" in {
      Task1.addNumbers(1, 1) must beEqualTo(2)
    }
    "add again" in {
      Task1.addNumbers(1, 2) must beEqualTo(3)
    }
    "add more" in {
      Task1.addNumbers(99999, 1) must beEqualTo(100000)
    }
  }

  "increaseCounterByN" should {
    "init" in {
      Task1.counter must beEqualTo(0)
    }
    "increase" in {
      Task1.increaseCounterByN(5) must beEqualTo(5)
    }
    "increase again" in {
      Task1.increaseCounterByN(5) must beEqualTo(10)
    }
  }

  "registerNumber" should {
    "init" in {
      Task1.odds must beEqualTo(0)
      Task1.evens must beEqualTo(0)
    }
    "increase" in {
      Task1.registerNumber(99)
      Task1.odds must beEqualTo(1)
      Task1.evens must beEqualTo(0)
    }
    "increase again" in {
      Task1.registerNumber(200)
      Task1.odds must beEqualTo(1)
      Task1.evens must beEqualTo(1)
    }
    "increase again x2" in {
      Task1.registerNumber(200)
      Task1.odds must beEqualTo(1)
      Task1.evens must beEqualTo(2)
    }
  }
  "hundredlist" should {
    "be long" in {
      Task1.hundredlist.size must beGreaterThanOrEqualTo(5)
    }
    "have correct sum" in {
      Task1.hundredlist.sum must beEqualTo(100)
    }
  }
  "addOne" should {
    "empty list" in {
      Task1.addOne(Nil) must beEmpty
    }
    "have correct elements" in {
      Task1.addOne(List(99, 101)) must beEqualTo(List(100, 102))
    }
  }
  "checkName" should {
    "HARRY" in {
      Task1.checkName("HARRY") must beTrue
    }
    "true for 10 letters" in {
      Task1.checkName("HARRY1234") must beFalse
    }
    "false for 9 letters" in {
      Task1.checkName("HARRY12345") must beTrue
    }
    "false for empty" in {
      Task1.checkName("") must beFalse
    }
  }

}
