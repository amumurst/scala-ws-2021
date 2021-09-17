import org.specs2.mutable.Specification

class Task3Spec extends Specification {
  "getVacationName" should {
    "1 month" in {
      Task3.getVacationName(1) must beNone
    }
    "12 month" in {
      Task3.getVacationName(12) must beSome("Juleferie")
    }
  }
  "increaseByOne" should {
    "None" in {
      Task3.increaseByOne(None) must beNone
    }
    "Some" in {
      Task3.increaseByOne(Some(99)) must beSome(100)
    }
  }
  "getName" should {
    "None" in {
      Task3.getName(None) must beEqualTo("Ingen")
    }
    "Some" in {
      Task3.getName(Some("Winter")) must beEqualTo("Winter")
    }
  }

  "getVacationName2" should {
    "1 month" in {
      Task3.getVacationName2(1) must beLeft
    }
    "12 month" in {
      Task3.getVacationName2(12) must beRight("Juleferie")
    }
  }
  "increaseByOne2" should {
    "Left" in {
      Task3.increaseByOne2(Left("Hello")) must beLeft
    }
    "Right" in {
      Task3.increaseByOne2(Right(99)) must beRight(100)
    }
  }
  "getName2" should {
    "Left" in {
      Task3.getName2(Left("Feil!")) must beEqualTo("Feil!")
    }
    "Right" in {
      Task3.getName2(Right("Korrekt")) must beEqualTo("Korrekt")
    }
  }
}
