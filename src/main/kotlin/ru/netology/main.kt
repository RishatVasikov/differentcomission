package ru.netology

fun main() {
    println("�������� ����� �������� � ��������")
    val currentOperation: Int = readLine()!!.toInt()
    println("�������� ����� ���������� ��������� � ����� � ��������")
    val previousOperation: Int = readLine()!!.toInt()
    val masterMaestroComission = ((currentOperation + previousOperation) * 0.006) + 2000
    val visaMirComission: Double
    if (currentOperation * 0.0075 <= 3500) {
        visaMirComission = 3500.00
    } else visaMirComission = currentOperation * 0.0075
    println("�������� ��� ����� �� ������ ������� Enter \n 1.Master card or Maestro \n 2. Visa or Mir \n 3.VK Pay")
    when (readLine()) {
        "1" -> if (0 <= currentOperation + previousOperation && currentOperation + previousOperation <= 7500000) {
            println("������� ��� ��������")
        } else if (7500000 <= currentOperation + previousOperation && currentOperation <= 15000000 && previousOperation <= 60000000) {
            println("�������� �� ������� �������� $masterMaestroComission ������")
        } else if (15000000 < currentOperation || 60000000 < previousOperation) {
            println("������������ ����� ��������� �� ����� ����� 150000 ���. � ����� � 600000 ���. � �����")
        } else println("������� ���������� �������� � ��������")
        "2" -> if (0 <= currentOperation && currentOperation <= 15000000 && currentOperation + previousOperation <= 60000000) {
            println("�������� �� ������� �������� $visaMirComission ������")
        } else if (15000000 < currentOperation || 60000000 < previousOperation) {
            println("������������ ����� ��������� �� ����� ����� 150000 ���. � ����� � 600000 ���. � �����")
        } else println("������������� ��������� � ������� ���������� �������� � ��������")
        "3" -> if (0 <= currentOperation && currentOperation <= 1500000 && currentOperation + previousOperation <= 4000000) {
            println("������� ��� ��������")
        } else if (1500000 < currentOperation && 4000000 < currentOperation + previousOperation) {
            println("������������ ����� ��������� �� ����� ����� 15000 ���. � ����� � 40000 ���. � �����")
        } else println("������������� ��������� � ������� ���������� �������� � ��������")
    }

}