

object week5b1 {
  def greet1 (x:String) : String = {
    val string1 = "Hello " + x + ", How U doing?"
    return string1
  }
  def greet2 (x:String) : String = {
    var string2 = "Hello " + x + ", How are you?"
    return string2
  }
  def frame (x:String, f:String => String) : String = {
    return (f(x))
  }
  def main(args: Array[String]) {
  println(frame("Alice", greet1))
  println(frame("James", greet2))
  }
}