object Task3 {

  /*
    A)
    Create a function that returns "Juleferie" if the month is 12, else None
   */

  def getVacationName(month: Int): Option[String] =
    ???

  /*
    B)
    Remember the .map function we used earlier on a list? It works exactly the same for Option!
    Create a function that increases the number inside the Option
   */

  def increaseByOne(perhapsNumber: Option[Int]): Option[Int] =
    ???

  /*
    C)
    Create a function that returns "Ingen" if there is no value inside the Option
    If there is a value, just return that
   */

  def getName(opt: Option[String]): String =
    ???

  //D;E;F => Expanding on above to include errors
  /*
    D)
    Create a function that returns "Juleferie" if the month is 12, else return the month
   */

  def getVacationName2(month: Int): Either[Int, String] =
    ???

  /*
    E)
    .map works for Eithers also, (Its almost as if it is somehow fundemental?), increas the number here too
   */

  def increaseByOne2(perhapsNumber: Either[String, Int]): Either[String, Int] =
    ???

  /*
    F)
    Create a function that returns the error if there is one
    If there is a value, just return that
   */

  def getName2(opt: Either[String, String]): String =
    ???
}

object OptionalEither {
  /*
        null. The dreaded null.

        Given that I call some function from a library that I did not write that has this signature:

        def foo(i: Int): String = ??? (I do not know the implementation, or it is very long and difficult)

        I should then be able to trust that signature and know that there is always a string coming back.
        But then I get `null` back.
        Wtf? That was not a part of the contract?
        Alas in many languages `null` is implicitly always a part of the contract for a signature!
        This means that you ALWAYS have to check it!

        So say we do not want to lie in our signature. What is the option?
        Well.. Option! (Haskell: Maybe, Java: Optional)
   */

  //The definition of Option is in the balpark of this
  enum MyOptional {
    case Some[A](a: A)
    case None
  }
  //Its a SUM-type ADT (from previous task), which has two possibilities. Either we have some value, or we have none.

  //We can then signal that there is actually a possibility of there not being a result!
  def firstElementOfList(l: List[Int]): Option[Int] =
    if (l.size >= 1) Some(l.head) else None
  // (Note that the above also is already defined in standard library as l.headOption)

  /*
        Okay lets call another function
        def bar(i: Int): String = ???
        Well it did not return null, but.. There is an "Exception" thrown?
        Where was THAT noted in the function?
        Again.. This is a part of a "implicit" contract in many languages, meaning you can not trust functions!

        Okay how to add it?
        Notice the wording from earlier `Either we have some value, or we have none.`
        Turns out we can generalise this!
   */

  //The definition of Either is in the balpark of this
  enum MyEither[A, B] {
    case Left(a: A)
    case Right(b: B)
  }

  /*
    Either represents a way of signaling that the value is either what you wanted (Right) or something else
   */

  //Using this we can define a function that actually tells us what is wrong, or returns the answer.
  def superSafeDivide(n: Int, m: Int): Either[String, Int] =
    if (m == 0) Left("Can not divide by zero!")
    else Right(n / m)

  //And the other way, this is just another ADT so we can pattern match on it as before
  def printSafeDivide(n: Int, m: Int) =
    superSafeDivide(n, m) match {
      case Left(error)   => println(error)
      case Right(result) => println(s"$n/$m = $result")
    }

  /*
    PSPS:
        Notice that neither of these constructs are "special".
        They are built upon fundemental language features and ADTs!
        Hence we do not need "more language syntax" to do this after we understand ADTs
        Examples of such "extra language syntax" include try-catch, throws annotations and ? nullability opperator
   */

}
