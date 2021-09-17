object Task4 {
  /*
    A)
    Write a function that finds the first person in a list with a name longer than N
    Note that this would return an option because there might be none!
   */
  case class Person(name: String)

  def firstLongName(persons: List[Person], N: Int): Option[Person] =
    persons match {
      case person :: rest if person.name.size > N => Some(person)
      case _ :: rest                              => firstLongName(rest, N)
      case Nil                                    => None
    }

  /*
    B) (Hard)
    Write a function that calculates the average value of a list recursively
    Make sure to only iterate through the list one time!
    Hint: Can you expand the function from the example below?
    Return 0 for empty lists
   */

  def averageListSafe(l: List[Int]): Int = {
    def loop(list: List[Int], sumSoFar: Int, counted: Int): Int =
      list match {
        case head :: rest => loop(rest, head + sumSoFar, counted + 1)
        case Nil          => if (counted == 0) 0 else sumSoFar / counted
      }

    loop(l, 0, 0)
  }
}

object Recursion {
  /*
    Recursion
    Recursive patterns is the basis on which functional programming
    allows itself to not use while or for-loops
   */

  //Consider the art of summing the numbers in a list

  //Mutable solution
  def mutableListSum(l: List[Int]): Int = {
    var x = 0
    for (element <- l) x += element
    x
  }

  //Unsafe Recursive solution
  def unsafeSumList(l: List[Int]): Int = l match {
    case head :: rest => unsafeSumList(rest) + head
    case Nil          => 0
  }
  //This solution is unsafe since it will eventually overflow the stack
  //unsafeSumList(unsafeSumList(unsafeSumList(.... times l.size
  //Console: unsafeSumList(List.fill(10000000)(1))

  //Safe recursion
  def sumListSafe(l: List[Int]): Int = {
    def loop(list: List[Int], sumSoFar: Int): Int =
      list match {
        case head :: rest => loop(rest, head + sumSoFar)
        case Nil          => sumSoFar
      }

    loop(l, 0)
  }
  //This solution is safe since the compiler can know that we do not need to
  //keep the rest of the stack and just call the function over and over
  // Concept is known as tail recursion
  //Console: sumListSafe(List.fill(10000000)(1))
}
