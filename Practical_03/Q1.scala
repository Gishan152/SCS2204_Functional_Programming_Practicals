object Q1{

    def reverse(str : String) : String = str match {
        case x if x.length == 1 => x
        case x => reverse(x.tail) + x.head
    }

    def main(args : Array[String]) = {
        val str = "Hello world!"
        val rstr = reverse(str)
        println("\n\nOriginal string : " + str)
        println("Reversed string : " + rstr + "\n\n")
    }
}