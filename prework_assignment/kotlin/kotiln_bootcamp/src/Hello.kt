import java.util.* //Ramdom()

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")

    // Will assign kotlin.Unit
    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)
    /*

    fun feedTheFish() {
        val day = randomDay()
        val food = "pellets"
        println ("Today is $day and the fish eat $food")
    }

    fun main(args: Array<String>) {
        feedTheFish()
    }

    fun randomDay() : String {
        val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday")
        return week[Random().nextInt(week.size)]
    }

    fun fishFood (day : String) : String { //return :String
        var food = "" //or var food : String
        when (day) { //day가 --라면
            "Monday" -> food = "flakes"
            "Tuesday" -> food = "pellets"
            "Wednesday" -> food = "redworms"
            "Thursday" -> food = "granules"
            "Friday" -> food = "mosquitoes"
            "Saturday" -> food = "lettuce"
            "Sunday" -> food = "plankton"
        }
        return food
    }

    fun feedTheFish() {
        val day = randomDay()
        val food = fishFood(day)

        println ("Today is $day and the fish eat $food")
    }
    */
    fun swim(speed: String = "fast") { //fast로 정의
        println("swimming $speed")
    }

    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")   // named parameter

    //compact function
    fun isTooHot(temperature: Int) = temperature > 30

    fun isDirty(dirty: Int) = dirty > 30

    fun isSunday(day: String) = day == "Sunday"

    /*filter list의 일부를 가져옴
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    fun main() {
        println( decorations.filter {it[0] == 'p'})
    }

    asSequence() -> 원소의 수 많을 때
    lambda A -> B B를 A에
    :: = 함수 참조
    */








}
