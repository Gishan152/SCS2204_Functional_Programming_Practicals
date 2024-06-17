object Q4{
    def calculateRawPrice(numberOfBooks : Int) : Double = numberOfBooks * 24.95
    def applyDiscount(rawPrice : Double) : Double = 0.6 * rawPrice
    def shippingCost(numberOfBooks : Int) : Double = if(numberOfBooks <= 50) numberOfBooks * 3 else 50 * 3 + (numberOfBooks - 50) * 0.75

    def main(args : Array[String]) = {
        val totalCost = applyDiscount(calculateRawPrice(60)) + shippingCost(60)
        println(totalCost)
    }
}