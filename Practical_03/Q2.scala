object Q2{
    def main(args : Array[String]) = {
        val strList = List("aaa", "bbbb", "ccccc", "dddddd", "eeeeeee")
        println("\n\nOriginal list : " + strList)
        println("Filtered list : " + filterStrings(strList) + "\n\n")
    }

    def filterStrings(strList : List[String]) = {
        strList.filter(_.length > 5)
    }
}