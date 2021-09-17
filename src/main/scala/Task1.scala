object Task1 {

  /*
   A)
   Return the sum of the two numbers
   */
  def addNumbers(i: Int, j: Int): Int = ???

  /*
   B)
   Define a function that increases the value, then returns the new value
   */

  var counter = 0 //Here we have a counter that holds some value
  def increaseCounterByN(n: Int): Int = {
    ???
  }

  /*
   C)
   Create a function that increases odds or evens depending on n.
   Hint: Use `n%2 == 0` to check for eveness
   */

  var odds                   = 0
  var evens                  = 0
  def registerNumber(n: Int) = ???

  /*
   D)
   Create a list with 5 or more elements that has a sum of 100
   */
  lazy val hundredlist: List[Int] = ???

  /*
   E)
   Create a function that adds 1 to all numbers in a list
   */
  def addOne(list: List[Int]): List[Int] = ???

  /*
   F)
   Create a function that returns true if the name is longer than 9 letters or is exactly "FINN"
   */
  def checkName(name: String): Boolean =
    ???
}

object Definitions {
  //Constant - Immediately evaluated immutable evaluated value
  //Note that we do not have to write the type that is returned.
  val x = 100

  //Variable - Immediately evaluated mutable evaluated value
  var x2 = 100

  //no-arg Function - Re-evaluate every time value
  def x3 = 100

  //Lazy evaluated value - Evaluate max once immutable value
  lazy val x4 = 100

  //In a function scope, the last value is returned automatically
  val thisIsAnInt: Int = {
    val x = 2
    val y = 5
    x * y
  }

  //If blocks are expressions
  val number            = 2
  val isGreaterThanFive = if (number > 5) "yes" else "no"

  //Common immutable data structures
  val someList = List(1, 2, 9)
  val someMap  = Map(1 -> "one", 2 -> "two")

  //Pattern matching
  val heyNumber            = 9
  val numberString: String = heyNumber match {
    case 0          => "Zero was a bad choice"
    case 9          => "Correct answer"
    case i if i > 9 => "Answer too big!"
    case _          => "Wrong answer"
  }

  /** * In pure functional programing we do not have constructs such as a for-loop or a while-loop
    * since they are inherently mutating state
    *
    * Instead all while and for-loops can be implemented as recursions and traversals
    */
  val list1 = List(1, 2, 3)
  val list2 = List(9, 8, 7)

  //Change all elements to strings
  //Imperrative method:
  var stringListMutable = List.empty[String]
  for (s <- list1)
    stringListMutable.appended(s.toString)
  //Immutable method
  val stringListImmutable = list1.map(s => s.toString)
}
