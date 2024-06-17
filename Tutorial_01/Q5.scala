object Q5{
    def easy(distance : Double) = distance * 8.0
    def tempo(distance : Double) = distance * 7.0
    def main(args : Array[String]) = {
        val totalRunningTime = easy(4) + tempo(3)
        println(totalRunningTime)
    }
}