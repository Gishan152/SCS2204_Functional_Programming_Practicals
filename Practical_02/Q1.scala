object Q1{
    def main(args : Array[String]) = {
        var k, i, j = 2;
        var m, n = 5;
        var f = 12.0f;
        var g = 4.0f;
        var c = 'X';

        println("k + 12 * m= " + (k + 12 * m))
        println("m / j= " + (m / j))
        println("n % j= " + (n % j))
        println("m / j * j= " + (m / j * j))
        println("f + 10 * 5 + g= " + (f + 10 * 5 + g))
        println("++i * n = " + {i = i + 1; i} * n)
        // ++i or i++ is not supported in scala
    }
}