object Q2{
    def main(args : Array[String]) = {
        var a = 2
        var b = 3
        var c = 4 
        var d = 5
        var k = 4.3f

        println({b = b - 1; b} * a + c * {val x = d; d = d - 1; x})

        println({val x = a; a = a + 1; x})

        // println(-2 * (g - k) + c) // Error : g is not found

        // println(c = {val x = c; c = c + 1; x}) 
        // Error : c = some_value this is a statement not an expression which returns a value 
        // means it cannot be printed
        
        // println(c = {c = c + 1; c} * {val x = a; a = a + 1; x})
        // Error : similer to the one above
        // a statement cannot be printed
    }
}