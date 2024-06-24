object Q3{
    def main(args : Array[String]) = {
        println("Weekly take home salary = " + takeHomeSalary(40, 30))
    }

    def salaryForNormalHours(hours : Double) = hours * 250
    def salaryForOtHours(hours : Double) = hours * 85
    def tax(salary : Double) = salary * 0.12

    def takeHomeSalary(salaryForNormalHourss : Int, salaryForOtHourss : Int) = {
        var salary = salaryForNormalHours(salaryForNormalHourss) + salaryForOtHours(salaryForOtHourss)
        salary = salary - tax(salary)
        salary
    }
}