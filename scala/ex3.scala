object ex3 {
  def max (x:Int, y:Int) : Int = {
    return x.max(y)
  }

  def get_max (x:Int, y:Int) : Int = {
    return max(x,y)
  }
  def main(args: Array[String]): Unit = {
    println(get_max(3, 5))
  }
}
