object calculadora {
	// Sum Function
	def sum(x: Int, y: Int):

		Int = x + y;
	// abstraction Function
	def abs(x: Int, y: Int): 

		Int  = x - y;
	// Divided Function
	def div(x: Int, y: Int):

		Int = x/y;
	// Multiplication Function
	def mul(x: Int, y: Int):

		Int = x * y;
	// 	Square Sum Function
	def sq(x: Double, y: Double, z:Double, t:Double):
        Double = scala.math.pow(x,y) + scala.math.pow(z,t)

	// Factorial Function
	def factorial(n: Int): Int = {
      if (n == 0) 
          return 1
      else
          return n * factorial(n-1)
    }
    // Exponential Function
    def potence(x: Double, y: Double): 
    	Double = scala.math.pow(x,y)

    //sqrt Function
    def sqrt(x: Double): 
    	Double = scala.math.sqrt(x)

    //to degrees  Function
    def toDegrees(x: Double): 
    	Double = scala.math.toDegrees(x)

    //to randiant Function
    def toRadians(x: Double): 
    	Double = scala.math.toRadians(x)

    //sin Function
    def sin(x: Double): 
    	Double = scala.math.sin(x)

    //tan Function
    def tan(x: Double): 
    	Double = scala.math.tan(x)

     //Cos Function
    def cos(x: Double): 
    	Double = scala.math.cos(x)

    //Loga Function
    def ln(x: Double): 
    	Double = scala.math.log(x)

    //Abs Value Function
    def abv(x: Double): 
    	Double = scala.math.abs(x)

    //GCD Function
    def gcd(a: Int, b: Int): Int = {
	  if (b == 0) {
	    a
	  } else {
	    gcd(b, a % b)
	  }
	}
}