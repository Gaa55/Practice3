fun main(args: Array<String>) {
    //1
    val myAge: Int = 18
    val isTeenager: Boolean = myAge in 13..19

// 2
    val theirAge: Int = 30
    val bothTeenagers: Boolean = myAge in 13..19 && theirAge in 13..19

// 3
    val reader: String = "Ваше имя"
    val author: String = "Richard Lucas"
    val authorIsReader: Boolean = reader == author

// 4
    val readerBeforeAuthor: Boolean = reader < author

// 5
    val myAge2: Int = 18
    val status: String = if (myAge2 in 13..19) "Подросток" else "Не подросток"
    println(status)

// 6
    val answer: String = if (myAge2 in 13..19) "Подросток" else "Не подросток"
    println(answer)

// 7
    var counter: Int = 0
    while (counter < 10) {
        println("counter равен $counter")
        counter++
    }

// 8
    counter = 0
    var roll: Int
    do {
        roll = (0..5).random()
        counter++
        println("После $counter бросков, roll равен $roll")
    } while (roll != 0)

// 9
    val range: IntProgression = 1..10 step 2
    var sum = 0
    for (number in range) {
        val square = number * number
        sum += square
    }

    println("Сумма квадратов чисел с шагом 2 равна $sum")

// 10
    for (number in range) {
        val squareRoot = Math.sqrt(number.toDouble())
        println("Квадратный корень из числа $number равен $squareRoot")
    }
}