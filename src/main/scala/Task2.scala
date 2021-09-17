object Task2 {
  enum Direction {
    case UP, DOWN, RIGHT, LEFT
  }

  /*
    A)
    Create a function that takes a direction and returns its norwegian name (OPP, NED, HØYRE, VENSTRE)
   */
  def directionInNorwegian(d: Direction): String = d match {
    case Direction.UP    => "OPP"
    case Direction.DOWN  => "NED"
    case Direction.LEFT  => "VENSTRE"
    case Direction.RIGHT => "HØYRE"
  }

  /*
    B)
    Create a function that takes a list of runners and calculates their total distance
    Hint: List(1,2,3).sum == 6
   */

  case class Runner(name: String, distance: Int)

  def totalRunDistance(runners: List[Runner]): Int = runners.map(_.distance).sum

  /*
    C)
    Create a function that takes a runner and returns true only if the name is Sonic OR the distance is over 1000
   */
  def runnerIsFast(runner: Runner): Boolean = runner match {
    case Runner("Sonic", _)                 => true
    case Runner(_, length) if length > 1000 => true
    case _                                  => false
  }
}

object ADT {
  /*
    Algebraic data type
    Wiki: `In computer programming, especially functional programming and type theory, an algebraic data type is a kind of composite type, i.e., a type formed by combining other types.`

    Defining an enumeration. These are sometimes reffered to as SUM TYPES.
    This is because if we want to know how many different cases there are, we count together all the cases (or 'variants') in the enum.

    This Pet type has 4 different possibilities. Some of them have data in them, others do not.
   */
  enum Pet {
    case Cat(name: String)
    case Fish(name: String, teeth: Long)
    case Squid(name: String, age: Int)
    case LochNessMonster
  }

  // Given some instances of pets, notice how the type can be very specific
  val someCutCat: Pet.Cat  = Pet.Cat("Pusefinn")
  val funySquid: Pet.Squid = Pet.Squid("Squidward", 3)

  // But if we put multiple of them together, we no longer know exactly what is in them, but we DO know that they all are still pets
  val petList: List[Pet] = List(someCutCat, funySquid)

  // If we define a function that takes in a pet we can use the knowledge that all cases ('variants') are already known and match over them!
  // If we forget something here, the compiler will warn us that we have not handeled all cases
  def royalPetName(p: Pet): String = p match {
    case Pet.Cat(name)                     => s"Emperor $name"
    case Pet.Fish(name, _)                 => s"Baron $name"
    case Pet.Squid(name, age) if age >= 10 => s"Duke $name"
    case Pet.Squid(name, age)              => s"Prince $name"
    case Pet.LochNessMonster               => s"Nessie the Loch Ness Monster"
  }

  // Then given the function above we can apply it to all our pets
  val royalPetNames: List[String] = petList.map(royalPetName)

  // If the values are static we can set them directly in the definition of the enum
  enum Color(val rgb: Int) {
    case Red extends Color(0xff0000)
    case Green extends Color(0x00ff00)
    case Blue extends Color(0x0000ff)
  }

  /*
    CLASS

    Classes are groupings of values.
    These are called `Product types`.
    This is because to count how many different `variants` we have, we have to multiply for each of the examples
   */

  case class ThreeBooleans(a: Boolean, b: Boolean, c: Boolean)
  /*
    Since we know Boolean is always one of 2 values (true, false), the total possibilities for ThreeBooleans is 2*2*2=8
    Reducing this number reduces the amounts of tests we have to write since you are more in controll over how many possible inputvalues there are.
   */

  //So for a name we often have this kind of definition
  case class Name(firstName: String, lastName: String)

  //Function that makes a single string of name (uses string interpolation)
  def makeSingleName(n: Name) = s"${n.firstName} ${n.lastName}"

  //Interestingly we can also expand it to matching and extracting
  def hasCoolName(n: Name) = n match {
    case Name("Amund", _)        => true
    case Name(_, "Murstad")      => true
    case Name("Harry", "Potter") => true
    case _                       => false
  }
}
