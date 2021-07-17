package ru.netology

fun main() {
    println("Наберите сумму перевода в копейках")
    val currentOperation: Int = readLine()!!.toInt()
    println("Наберите сумму предыдущих переводов в месяц в копейках")
    val previousOperation: Int = readLine()!!.toInt()
    val masterMaestroComission = ((currentOperation + previousOperation) * 0.006) + 2000
    val visaMirComission: Double
    if (currentOperation * 0.0075 <= 3500) {
        visaMirComission = 3500.00
    } else visaMirComission = currentOperation * 0.0075
    println("Выберите тип карты из списка нажмите Enter \n 1.Master card or Maestro \n 2. Visa or Mir \n 3.VK Pay")
    when (readLine()) {
        "1" -> if (0 <= currentOperation + previousOperation && currentOperation + previousOperation <= 7500000) {
            println("Перевод без комиссии")
        } else if (7500000 <= currentOperation + previousOperation && currentOperation <= 15000000 && previousOperation <= 60000000) {
            println("Комиссия за перевод составит $masterMaestroComission копеек")
        } else if (15000000 < currentOperation || 60000000 < previousOperation) {
            println("Максимальная сумма переводов по одной карте 150000 руб. в сутки и 600000 руб. в месяц")
        } else println("Введите корректные значения в копейках")
        "2" -> if (0 <= currentOperation && currentOperation <= 15000000 && currentOperation + previousOperation <= 60000000) {
            println("Комиссия за перевод составит $visaMirComission копеек")
        } else if (15000000 < currentOperation || 60000000 < previousOperation) {
            println("Максимальная сумма переводов по одной карте 150000 руб. в сутки и 600000 руб. в месяц")
        } else println("Перезапустите программу и введите корректные значения в копейках")
        "3" -> if (0 <= currentOperation && currentOperation <= 1500000 && currentOperation + previousOperation <= 4000000) {
            println("Перевод без комиссии")
        } else if (1500000 < currentOperation && 4000000 < currentOperation + previousOperation) {
            println("Максимальная сумма переводов по одной карте 15000 руб. в сутки и 40000 руб. в месяц")
        } else println("Перезапустите программу и введите корректные значения в копейках")
    }

}