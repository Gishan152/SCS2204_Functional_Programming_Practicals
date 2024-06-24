object Q4{
    def main(args : Array[String]) = {
        println("profix vs ticket price")
        var bestPrice : Double = 0.0
        var maxProfit : Double = 0.0
        for(i <- 1 to 30){
            val x = print(i)
            if(maxProfit < x._2){
                bestPrice = x._1
                maxProfit = x._2
            }
        }
        println("so the best price is : " + bestPrice)
        println("profit for that price is : " + maxProfit)


    }

    // price                    - attendence
    // 15.00                    - 120
    // 15.00 - 5.00 => 10.00    - 120 + 20 = 140
    // 15.00 + 5.00 => 20.00    - 120 - 20 = 100
    // 120 + (15 - x) / 5 * 20  - y

    // performance cost : 500
    // attendee cost : 3

    def calculateNoOfAttendees(ticketPrice : Double) = 120 + (15 - ticketPrice) / 5 * 20
    def revenue(noOfAttendees : Double, ticketPrice : Double) = ticketPrice * noOfAttendees
    def cost(noOfAttendees : Double) = 500 + 3 * noOfAttendees
    def profit(ticketPrice : Double) = {
        val noOfAttendees = calculateNoOfAttendees(ticketPrice)
        revenue(noOfAttendees, ticketPrice) - cost(noOfAttendees)
    }

    def print(ticketPrice : Double) = {
        val profitForTicketPrice = profit(ticketPrice)
        println("ticket price " + ticketPrice + " -> profit : " + profitForTicketPrice)
        (ticketPrice, profitForTicketPrice)
    }

    

}