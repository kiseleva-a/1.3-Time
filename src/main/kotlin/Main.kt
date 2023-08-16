fun main(args: Array<String>) {
    println("Введите в секундах количество времени, которое прошло с момента последней активности пользователя")

    val inputTime = Integer.valueOf(readLine())
    val activityCheck: String = agoToText(inputTime)
    println(activityCheck)
}
fun agoToText(inputTime: Int):String = when (inputTime) {
    in 0..60 -> "был(а) только что"
    61, 21 * 60, 31 * 60, 41 * 60, 51 * 60 -> {"был(а) " + inputTime/60 + " минуту назад"}
    in 2 * 60..4 * 60 -> {"был(а) " + inputTime/60 + " минуты назад"}
    in 5 * 60..1 * 60 * 60 -> {"был(а) " + inputTime/60 + " минут назад"}
    1 * 60 * 60 + 1, 21 * 60 * 60 -> {"был(а) " + inputTime/60/60 + " час назад"}
    in 2 * 60 * 60..4 * 60 * 60 -> {"был(а) " + inputTime/60/60 + " часа назад"}
    in 5 * 60 * 60..20 * 60 * 60  -> {"был(а) " + inputTime/60/60 + " часов назад"}
    in 22 * 60 * 60..24 * 60 * 60 -> {"был(а) " + inputTime/60/60 + " часа назад"}
    in 24 * 60 * 60 + 1..48 * 60 * 60 -> "был(а) вчера"
    in 48 * 60 * 60 + 1..72 * 60 * 60 -> "был(а) позавчера"
    else -> "был(а) давно"

}