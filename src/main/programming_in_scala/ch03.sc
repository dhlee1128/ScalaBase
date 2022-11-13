/*
* 리스트를 사용해보자.
* */
val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwoThreeFour)

// :: -> 콘즈(cons)
val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree
val oneTwoThree2 = twoThree :: 1 :: Nil
println(oneTwoThree)
println(oneTwoThree2)


/*
* 튜플을 사용해보자.
* */
val pair = (99, "number")
println(pair._1)
println(pair._2)


/*
* 집합과 맵을 써보자.
* */
var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear" // 새로운 집합으로 재할당
println(jetSet.contains("Cessna"))

import scala.collection.mutable.Set
val movieSet = Set("Hitch", "Poltergeist")
movieSet += "Shrek"
println(movieSet)

val romanNumeral = Map(
  1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
)
println(romanNumeral(4))

/*
* 함수형 스타일을 배워보자.
* */
def printArgs(args: Array[Int]): Unit = {
  for (arg <- args)
    println(arg)
}


