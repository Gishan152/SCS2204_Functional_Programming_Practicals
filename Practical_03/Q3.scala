object Q3{
    def main(args : Array[String]) = {
        printf("\n\nArithmetic mean : %.2f \n\n", mean(5, 10))
    }

    def mean(num1 : Int, num2 : Int) = {
        val x = (num1.toFloat + num2.toFloat) / 2
        scala.math.BigDecimal(x).setScale(2, BigDecimal.RoundingMode.HALF_UP).toFloat
    }
}