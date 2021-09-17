import org.specs2.mutable.Specification
import Task4.Person

class Task4Spec extends Specification {
  "firstLongName" should {
    "Nil" in {
      Task4.firstLongName(Nil, 2) must beEmpty
    }
    "Only short" in {
      Task4.firstLongName(List(Person("a")), 2) must beEmpty
    }
    "Long" in {
      Task4.firstLongName(List(Person("a"), Person("hello")), 2) must beSome(Person("hello"))
    }
  }
  "listaverage" should {
    "Nil" in {
      Task4.averageListSafe(Nil) must beEqualTo(0)
    }
    "List" in {
      Task4.averageListSafe(List(0, 50, 100)) must beEqualTo(50)
    }
  }
}
