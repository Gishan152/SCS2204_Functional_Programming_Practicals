object Q4{
    def sumEvenNumbers(numbers: List[Int]): Int = {
      numbers.filter(_ % 2 == 0).sum
    }
    
    def main(args : Array[String]) = {
        val nums = List(1, 2, 3, 4, 5, 6)
        println("\n\nSum of even numbers : " + sumEvenNumbers(nums) + "\n\n")
    }

}
