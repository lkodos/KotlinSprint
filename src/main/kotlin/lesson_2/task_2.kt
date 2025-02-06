//В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров,
// которым назначили зарплату в 20000 рублей каждому.
// Пишем часть гипотетического софта для бухгалтерии, который будет считать:
//
//– Расходы на выплату зарплаты постоянных сотрудников;
//– Общие расходы по ЗП после прихода стажеров;
//– Среднюю ЗП одного сотрудника после устройства стажеров.
//
//Каждый пункт посчитать и сохранить в переменную с соответствующим названием.
// Все значения необходимо вывести в виде целых чисел.

package lesson_2

fun main() {

    val numberOfEmployes = 50
    val employeeSalary = 30000
    val numberOfIntern = 30
    val internSalary = 20000

    val totalEmployeeSalary = calcTotalEmployeeSalary(numberOfEmployes, employeeSalary)
    val totalSalary = calcTotalSalary(numberOfEmployes, employeeSalary, numberOfIntern, internSalary)
    val averagelSalary = calcAverageSalary(numberOfEmployes, employeeSalary, numberOfIntern, internSalary)

    println("Total employee salary: $totalEmployeeSalary")
    println("Total salary: $totalSalary")
    println("Average salary: $averagelSalary")
}

fun calcTotalEmployeeSalary(numberOfEmployes: Int, employeeSalary: Int): Int {
    return numberOfEmployes * employeeSalary
}

fun calcTotalSalary(numberOfEmployes: Int, employeeSalary: Int, numberOfIntern: Int, internSalary: Int): Int {
    return (numberOfEmployes * employeeSalary) + (numberOfIntern * internSalary)
}

fun calcAverageSalary(numberOfEmployes: Int, employeeSalary: Int, numberOfIntern: Int, internSalary: Int): Int {
    return (calcTotalInternSalary(numberOfIntern, internSalary) +
            calcTotalEmployeeSalary(numberOfEmployes, employeeSalary)) /
            (numberOfEmployes + numberOfIntern)
}

fun calcTotalInternSalary(numberOfIntern: Int, internSalary: Int): Int {
    return numberOfIntern * internSalary
}