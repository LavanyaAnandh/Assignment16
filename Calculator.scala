//Calculator in scala

class calc() {
  var num1: Int = 0
  var num2: Int = 0
  var num3: Double = 0.0
  var num4: Double = 0.0
 
  //Auxilary Constructor for handling Whole numbers
  def this (a:Int, b:Int) {
    this();
    this.sum(a, b)
    this.sub(a, b)
    this.mult(a, b)
    this.div(a, b)
  }
  //Auxilary Constructor for handling Rational numbers
  def this (x:Double, y:Double) {
    this();
    this.sum(x, y)
    this.sub(x, y)
    this.mult(x, y)
    this.div(x, y)
   }
   //function overloading for addition, substraction, multiplication and division of whole numbers.  
   def sum(a: Int, b: Int): Int =  a + b; 
   def sub(a: Int, b: Int): Int =  a - b; 
   def mult(a: Int, b: Int): Int =  a * b; 
   def div(a: Int, b: Int): Int =  a / b; 
   //Function overloading for addition, substraction, multiplication and division of rational numbers.
   def sum(x: Double, y: Double): Double =  x + y; 
   def sub(x: Double, y: Double): Double =  x + y;
   def mult(x: Double, y: Double): Double =  x * y;
   def div(x: Double, y: Double): Double =  x / y;
   
   //Implementation to find gcd of rational numbers.
   def gcd(a: Double, b: Double): Double = {
     if(b==0) a else gcd(b, a%b)  
    }
}

//Companion object.

object Calculator {
def main(args: Array[String]) {
  val calcObj = new calc();
  println("Addition of 2 whole number(1, 2) is:")
  println(calcObj.sum(1, 2))
  println("Addition of 2 rational number(1.5, 2.5) is:")
  println(calcObj.sum(1.5, 2.5))
  println("Addition of whole number(1) + rational number(2.5) is:")
  println(calcObj.sum(1, 2.5))
  println("Addition of rational number(2.5) + whole number(1) is:")
  println(calcObj.sum(1.5, 2))
  println("Gcd of rational number(24.0) + whole number(8) is:")
  println(calcObj.gcd(24.0, 8))
  println("gcd of whole number(24) + whole number(8) is:")
  println(calcObj.gcd(24, 8))
  
  println("Subtraction of 2 whole number(8, 5) is:")
  println(calcObj.sub(8, 5))
  println("Subtraction of 2 rational number(10.5, 2.5) is:")
  println(calcObj.sub(10.5, 2.5))
  
  println("Multiplication of 2 whole number(8, 5) is:")
  println(calcObj.mult(8, 5))
  println("Multiplication of 2 rational number(10.5, 2.5) is:")
  println(calcObj.mult(10.5, 2.5))
  println("Multiplication of rational number(2.5) + whole number(3) is:")
  println(calcObj.mult(2.5, 3))
  
  println("Division of 2 whole number(8, 4) is:")
  println(calcObj.div(8, 4))
  println("Division of 2 rational number(10.5, 2.5) is:")
  println(calcObj.div(10.5, 2.5))
  println("Division of rational number(8.5) + whole number(2) is:")
  println(calcObj.mult(8.5, 2))
}
}