import org.specs2.mutable.Specification
import Task2.Direction._
import Task2.Runner

class Task2Spec extends Specification {
  "directionInNorwegian" should {
    "UP" in {
      Task2.directionInNorwegian(UP) must beEqualTo("OPP")
    }
    "DOWN" in {
      Task2.directionInNorwegian(DOWN) must beEqualTo("NED")
    }
    "RIGHT" in {
      Task2.directionInNorwegian(RIGHT) must beEqualTo("HØYRE")
    }
    "LEFT" in {
      Task2.directionInNorwegian(LEFT) must beEqualTo("VENSTRE")
    }
  }
  "totalRunDistance" should {
    "Empty list" in {
      Task2.totalRunDistance(Nil) must beEqualTo(0)
    }
    "List" in {
      val runners = List(Runner("foo", 123), Runner("foo", 456))
      Task2.totalRunDistance(runners) must beEqualTo(579)
    }
  }
  "runnerIsFast" should {
    "Sonic" in {
      val runner = Runner("Sonic", 1)
      Task2.runnerIsFast(runner) must beTrue
    }
    "1000" in {
      val runner = Runner("Random", 1001)
      Task2.runnerIsFast(runner) must beTrue
    }
    "other" in {
      val runner = Runner("Random", 1)
      Task2.runnerIsFast(runner) must beFalse
    }
  }
}
