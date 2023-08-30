fun main(args: Array<String>) {
    println("Введите в секундах количество времени, которое прошло с момента последней активности пользователя")

    val inputTime = Integer.valueOf(readLine())
    val activityCheck: String = agoToText(inputTime)
    println(activityCheck)
}
fun agoToText(inputTime: Int):String = when {
    inputTime in 0..60 -> "был(а) только что"
    inputTime in 61..60*60 -> timeToMinutes(inputTime)
    inputTime in 60 * 60 + 1..24 * 60 * 60 -> timeToHours(inputTime)
    inputTime in 24 * 60 * 60 + 1..48 * 60 * 60 -> "был(а) вчера"
    inputTime in 48 * 60 * 60 + 1..72 * 60 * 60 -> "был(а) позавчера"
    else -> "был(а) давно"

}

fun timeToMinutes (inputTime: Int): String = when {
    inputTime / 60 % 10 == 1 && inputTime / 60 != 11 -> {"был(а) " + inputTime/60 + " минуту назад"}
    inputTime / 60 % 10 in 2..4 && inputTime / 60 % 10 !in 12..14 -> {"был(а) " + inputTime/60 + " минуты назад"}
    inputTime in 5 * 60.. 60 * 60 -> {"был(а) " + inputTime/60 + " минут назад"}
    else -> "Ошибка!"
}
 fun timeToHours (inputTime: Int): String = when {
     inputTime == 1 * 60 * 60 + 1 || inputTime == 21 * 60 * 60 -> {"был(а) " + inputTime/60/60 + " час назад"}
     inputTime in 2 * 60 * 60..4 * 60 * 60 -> {"был(а) " + inputTime/60/60 + " часа назад"}
     inputTime in 5 * 60 * 60..20 * 60 * 60  -> {"был(а) " + inputTime/60/60 + " часов назад"}
     inputTime in 22 * 60 * 60..24 * 60 * 60 -> {"был(а) " + inputTime/60/60 + " часа назад"}
     else -> "Ошибка!"
 }
