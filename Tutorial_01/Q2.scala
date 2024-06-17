object Q2{
    def toFahrenheit(celcius : Double) : Double = celcius * 1.8 + 32.0
    def main(args : Array[String]) = {
        println(toFahrenheit(34))
    }
}