//Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
//
//- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
//- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
//- Значения часов, минут и секунд отображать двумя цифрами.
//
//package lesson_1

const val SEC_IN_MIN = 60

fun main() {

    val totalSeconds = 6480

    val hours = totalSeconds / (SEC_IN_MIN * SEC_IN_MIN)
    val minutes = (totalSeconds % (SEC_IN_MIN * SEC_IN_MIN)) / SEC_IN_MIN
    val seconds = totalSeconds % SEC_IN_MIN

    println("Время в космосе: %02d:%02d:%02d".format(hours, minutes, seconds))
}