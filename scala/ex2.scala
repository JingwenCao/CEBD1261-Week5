object ex2 {
  val nums = 1 to 45 toList
  val divnums = nums.filter((x: Int) => x % 4 == 0)
  val divby3 = nums.filter((x:Int) => x%3 == 0)
  val divnums2 = divby3.filter((x:Int) => x<20)

  def sum (a:List[Int]) : Int = {
    return a.reduce((x:Int, y:Int) => x + y)
  }
  def main(args: Array[String]): Unit = {
    println(sum(divnums))
    println(sum(divnums2))
  }
}