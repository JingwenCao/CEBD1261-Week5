

object week5b2 {
  val nums = List(1,2,3,4,5,6,7,8,9)
  val oddlist = nums.filter((x:Int) => x%2 != 0)
  
  def factorial(n: AnyVal): String = {
    n match {
      case i:Int => {
        return factorialHelper(i).toString()
      }
      case j:Double => {
        return factorialHelper(converter(j)).toString()
      }
    }
  }
  
  def factorialHelper(i:Int): Int = {
    if (i==0)
      return 1
    else
      return i * factorialHelper(i-1)
  }
  
  def converter (j:Double): Int = {
    return j.toInt
  }
  
  def main (args: Array[String]): Unit = {
    for (n <- oddlist) {println(factorial(n))
    }
  }
}